package controller;

import domian.Teacher;
import service.TeacherService;

import java.util.Scanner;

/**
 * Created by Administrator on 2021-02-20.
 */
public class TeacherController {

    private Scanner sc = new Scanner(System.in);
    private TeacherService teacherService = new TeacherService();
    public void start() {
        teacherLoop:
        while(true) {
            System.out.println("---------------欢迎进入老师管理系统---------------");
            System.out.println("请输入您的选择：1.添加老师信息 2.删除老师信息 3.修改老师信息 4.查看老师信息 5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.println("添加老师信息");
                    addTeacher();
                    break;
                case "2":
                    System.out.println("删除老师信息");
                    deleteTeacherById();
                    break;
                case "3":
                    System.out.println("修改老师信息");
                    updateTeacher();
                    break;
                case "4":
                    System.out.println("查看老师信息");
                    findAllTeacher();
                    break;
                case "5":
                    System.out.println("感谢您使用老师信息管理系统！");
                    break teacherLoop;
                default:
                    System.out.println("您的输入有误，请重新输入：");
            }
        }
    }

    //添加老师方法
    public void addTeacher() {
        String id;
        while (true) {
            System.out.println("请输入老师id：");
            id = sc.next();
            //1.判断id是否存在
            boolean exists = teacherService.isExists(id);
            if(exists) {
                //id存在
                System.out.println("此id已被占用，请重新输入：");
                //break;
            }else {
                //id不存在
                break;
            }
        }
        //2.接收老师其他信息
        /*System.out.println("请输入老师姓名：");
        String name = sc.next();
        System.out.println("请输入老师年龄：");
        String age = sc.next();
        System.out.println("请输入老师生日：");
        String birthday = sc.next();

        //3.封装老师对象
        Teacher teacher = new Teacher();
        //Exception in thread "main" java.lang.NullPointerException
        //报错：空指针异常，因为接收的老师信息没有封装到teacher对象中，所以teacher为空，导致Teacher[] teachers为空
        *//*teacher.setId(id);
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setBirthday(birthday);*//*
        teacher.setId(id);
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setBirthday(birthday);*/
        //2.接收老师其他信息并封装老师对象
        Teacher teacher = inputTeacherInfo(id);

        //3.将封装好的老师对象传递给TeacherService业务员中的addTeacher方法
        boolean result = teacherService.addTeacher(teacher);

        //4.根据返回结果给出提示添加成功或者失败
        if(result) {
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }

    //查看老师方法
    public void findAllTeacher() {
        Teacher[] teachers = teacherService.findAllTeacher();
        //1.判断数组中是否有元素
        if(teachers == null) {
            System.out.println("暂无老师信息，请先添加");
            return;
        }

        System.out.println("编号\t姓名\t年龄\t生日");
        //2.遍历数组
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            //3.判断teacher对象中是否有null元素，避免空指针异常
            if(teacher != null) {
                //4.将数组中的teacher对象通过get方法获取并打印在控制台
                System.out.println(teacher.getId()+"\t"+teacher.getName()+"\t"+teacher.getAge()+"\t\t"+teacher.getBirthday());
            }
        }

    }

    //删除老师方法
    private void deleteTeacherById() {
        //1.接收要删除的老师id
        String deleteId = inputTeacherId();
        //2.调用teacherService.deleteTeacherById()方法，根据id删除老师
        teacherService.deleteTeacherById(deleteId);
        //3.打印提示删除成功
        System.out.println("删除成功");

    }

    //修改老师方法
    public void updateTeacher() {
        //1.接收要修改的老师id
        String updateId = inputTeacherId();
        //2.重新接收老师信息
        Teacher newTeacher = inputTeacherInfo(updateId);
        //4.调用TeacherService中的updateTeacher方法，并将updateId和newTeacher传入
        teacherService.updateTeacher(updateId,newTeacher);
        //5.给出提示修改成功
        System.out.println("修改成功");
    }

    //录入老师id方法
    public String inputTeacherId() {
        String id;
        while(true) {
            System.out.println("请输入老师id：");
            id = sc.next();
            boolean exists = teacherService.isExists(id);
            if(!exists) {
                System.out.println("您输入的id不存在，请重新输入：");
            }else {
                break;
            }
        }
        return id;
    }

    //录入老师信息并封装为老师对象方法
    public Teacher inputTeacherInfo(String id) {
        System.out.println("请输入老师姓名：");
        String name = sc.next();
        System.out.println("请输入老师年龄：");
        String age = sc.next();
        System.out.println("请输入老师生日：");
        String birthday = sc.next();
        //3.将老师信息封装为老师对象
        Teacher newTeacher = new Teacher();
        newTeacher.setId(id);
        newTeacher.setName(name);
        newTeacher.setAge(age);
        newTeacher.setBirthday(birthday);
        return newTeacher;
    }
}
