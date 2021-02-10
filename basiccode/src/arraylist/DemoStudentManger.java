package arraylist;

import domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 2021-02-09.
 */
public class DemoStudentManger {
    /*
    * 需求：创建一个学生管理系统，实现如下页面功能：
    * ----------------欢迎进入学生管理系统-----------------
    * 1.添加学生
    * 2.删除学生
    * 3.修改学生
    * 4.查看所有学生
    * 5.退出
    * 6.请输入您的选择：
    *
    * 思路：
    * 1.创建一个泛型为Student的集合容器，用于存储学生对象；
    * 2.创建一个学生对象，并用于封存学生学号，姓名，年龄，生日；
    * 3.创建主界面菜单栏，并接收用户输入的选择；
    * 4.将用户的输入与菜单编号匹配，匹配成功就进入该菜单的功能实现；
    * 5.添加学生
    * 6.查看学生
    * 7.删除学生
    * 8.修改学生
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.创建泛型为Student的集合容器对象
        ArrayList<Student> list = new ArrayList<Student>();

        //用户一般都需要多次进入菜单进行操作，所以需要使用while循环来实现；
        lo: while(true) {
            //3.创建主界面菜单栏，并接收用户输入的选择；
            System.out.println("-------------欢迎进入学生管理系统--------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入您的操作编号：");
            int choice = sc.nextInt();
            //4.将用户的输入与菜单编号匹配，匹配成功就进入该菜单的功能实现；
            switch(choice) {
                case 1:
                    System.out.println("添加学生信息");
                    addStudent(list);
                    break;
                case 2:
                    System.out.println("删除学生信息");
                    deleteStudent(list);
                    break;
                case 3:
                    System.out.println("修改学生信息");
                    updateStudent(list);
                    break;
                case 4:
                    System.out.println("查看所有学生信息");
                    queryStudent(list);
                    break;
                case 5:
                    System.out.println("退出");
                    break lo;
                default:
                    System.out.println("您输入的选择有误，请重新输入：");
                    break;
            }

        }

    }
    //5.添加学生
    public static void addStudent(ArrayList<Student> list) {
        //键盘录入接收学生信息，但是当录入的学生的学号已经存在就不能录入了，这就需要对sid进行判断，
        //通过getIndex方法看返回的索引值是否存在，若存在就不能录入，若不存在正常录入
        Scanner sc = new Scanner(System.in);
        String sid;
        while(true) {
            System.out.println("请输入学生sid：");
            sid = sc.next();
            int index = getIndex(list,sid);
            if(index == -1) {
                //该学号不存在
                break;
            }else {
                System.out.println("您输入的学号已经存在！");
            }
        }
        System.out.println("请输入学生name：");
        String name = sc.next();
        System.out.println("请输入学生age：");
        int age = sc.nextInt();
        System.out.println("请输入学生birthday：");
        String birthday = sc.next();
        //2.创建一个学生对象，并用于封存接收的学生学号，姓名，年龄，生日；
        Student stu = new Student(sid,name,age,birthday);
        list.add(stu);
        System.out.println("添加成功");
    }
    //6.查看学生
    public static void queryStudent(ArrayList<Student> list) {
        if(list.size() == 0) {
            System.out.println("暂无学生信息，请添加");
            return;
        }else {
            System.out.println("学号\t姓名\t年龄\t生日");
            for (int i = 0; i < list.size(); i++) {
                Student stu1 = list.get(i);
                System.out.println(stu1.getSid()+"\t"+stu1.getName()+"\t"+stu1.getAge()+"岁"+"\t"+stu1.getBirthday());
            }
        }
    }
    //修改或者删除学生信息：通过学号去找集合中的学生对象是否存在同样的学号，然后找到学号所对应的集合中学生对象的索引位置，
    //最后删除或者修改学生信息就可以直接通过索引来进行
    public static int getIndex(ArrayList<Student> list,String sid) {
        //假设该学号所对应的索引不存在
        int index = -1;
        //遍历集合中的学生对象
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            //找到所有集合中的学生对象的id
            String id = stu.getSid();
            //让所有学生的id与用户输入的sid匹配
            if(id.equals(sid)) {
                //匹配成功，记录索引的值
                index = i;
            }
        }
        return index;
    }
    //7.删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生学号：");
        String deleteId = sc.next();
        int index = getIndex(list,deleteId);
        if(index == -1){
            System.out.println("您要删除的学生不存在");
            return;
        }else {
            list.remove(index);
        }
        System.out.println("删除成功");
    }
    //8.修改学生
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生学号：");
        String updateId = sc.next();
        int index = getIndex(list,updateId);
        if(index == -1){
            System.out.println("您要修改的学生不存在");
            return;
        }else {
            System.out.println("请输入要修改的姓名：");
            String updateName = sc.next();
            System.out.println("请输入要修改的年龄：");
            int updateAge = sc.nextInt();
            System.out.println("请输入要修改生日：");
            String updateBirthday = sc.next();
            Student stu = new Student(updateId,updateName,updateAge,updateBirthday);
            list.set(index,stu);
        }
        System.out.println("修改成功");
    }
}
