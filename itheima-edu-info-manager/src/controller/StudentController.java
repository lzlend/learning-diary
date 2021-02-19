package controller;

import domian.Student;
import service.StudentService;

import java.util.Scanner;

/**
 * Created by Administrator on 2021-02-18.
 */
public class StudentController {

    private StudentService studentService = new StudentService();
    private Scanner sc = new Scanner(System.in);

    public void start() {

        stuLoop:while(true) {
                    System.out.println("-------------欢迎进入学生管理系统--------------");
                    System.out.println("请输入你的选择：1.添加 2.删除 3.修改 4.查看 5.退出");
                    String choice = sc.next();
                    switch (choice){
                        case "1":
                            System.out.println("添加学生");
                            addStudent();
                            break;
                        case "2":
                            System.out.println("删除学生");
                            deleteStudentById();
                            break;
                        case "3":
                            System.out.println("修改学生");
                            updateStudent();
                            break;
                        case "4":
                            System.out.println("查看学生");
                            findAllStudent();
                            break;
                        case "5":
                            System.out.println("感谢您的使用！");
                            break stuLoop;
                        default:
                            System.out.println("您的输入有误，请重新输入：");
                    }

        }
    }
    //添加学生方法
    public void addStudent() {
        //StudentService studentService = new StudentService();
        Scanner sc = new Scanner(System.in);
        String id;
        //1.键盘录入接收学生信息
        while(true) {
            System.out.println("请输入学生学号：");
            id = sc.next();
            boolean flag = studentService.isExists(id);
            if(flag) {
                //学号存在，请重新输入学号存在，请重新输入
                System.out.println("该学号已存在，请重新输入：");
            }else {
                break;
            }

        }
        //2.调用键盘录入学生信息方法
        Student stu = inputStudentInfo(id);
        //3.将封装好的学生对象传递给StudentController（业务员）中的addStudent()方法
        boolean result = studentService.addStudent(stu);
        //4.根据返回的boolean类型结果在控制台输出添加成功或者失败
        if(result) {
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }
    //查看学生方法
    public void findAllStudent() {
        //1.调用StudentController业务员中的获取方法，得到其中的学生对象
        Student[] stus = studentService.findAllStudent();
        //2.判断数组的内存地址是否为null
        if(stus == null) {
            System.out.println("查无信息，请添加后再查询");
            return;
        }
        //3.遍历数组，并将数组元素（学生信息）打印在控制台
        System.out.println("学号\t姓名\t年龄\t生日");
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            //判断学生对象的是否为空，如果不为空就打印在控制台
            if(student != null) {
                System.out.println(student.getId()+"\t"+student.getName()+"\t"+student.getAge()+"\t\t"+student.getBirthday());
            }
        }
    }
    //删除学生方法
    public void deleteStudentById() {
        //1.接收要删除的学生id
        String deleteId = inputStudentId();
        //2.调用StudentService中的deleteStudentById方法，根据id删除该学生
        studentService.deleteStudentById(deleteId);
        //3.提示删除成功
        System.out.println("删除成功！");
    }
    //修改学生方法
    public void updateStudent() {
        //1.接收要删除的学生id
        String updateId = inputStudentId();
        //2.重新输入学生信息并封装为一个新的学生对象
        Student newStu = inputStudentInfo(updateId);

        //3.调用StudentService中的updateStudent方法，根据id修改该学生
        studentService.updateStudent(updateId,newStu);
        //4.提示修改成功
        System.out.println("修改成功！");
    }
    //键盘录入学生id方法
    public String inputStudentId() {
        //1.键盘接收学生id
        String id;
        while(true) {
            System.out.println("请输入学生学号：");
            id = sc.next();
            //2.判断该id在数组中是否存在，如果不存在则一直录入
            boolean exists = studentService.isExists(id);
            if(!exists) {
                //id不存在
                System.out.println("您输入的id不存在，请重新输入：");
            }else {
                //id存在
                break;
            }
        }
        return id;
    }
    //键盘录入学生信息方法
    public Student inputStudentInfo(String id) {
        //1.重新输入学生信息并封装为一个新的学生对象
        System.out.println("请输入学生姓名：");
        String name= sc.next();
        System.out.println("请输入学生年龄：");
        String age= sc.next();
        System.out.println("请输入学生生日：");
        String birthday = sc.next();
        Student newStu = new Student();
        newStu.setId(id);
        newStu.setName(name);
        newStu.setAge(age);
        newStu.setBirthday(birthday);
        //2.返回封装的学生对象
        return newStu;
    }
}
