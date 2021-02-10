package arraylist;
import java.util.ArrayList;
import java.util.Scanner;

import domain.Student;
/**
 * Created by Administrator on 2021-02-08.
 */
public class Demo1ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("111");
        list.add("222");
        list.add("333");
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }
        System.out.println("------------------------------");
        /*ArrayList<Student> stuList = new ArrayList<Student>();
        Student stu1 = new Student("张三","23");
        Student stu2 = new Student("李四","24");
        Student stu3 = new Student("王五","25");
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);
        for (int i = 0; i < stuList.size(); i++) {
            Student stu = stuList.get(i);
            System.out.println(stu);
            System.out.println(stu.getName()+"..."+stu.getAge());
        }*/
        ArrayList<Student> stuList = new ArrayList<Student>();
        Student stu1 = getStudent();
        Student stu2 = getStudent();
        Student stu3 = getStudent();
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);
        for (int i = 0; i < stuList.size(); i++) {
            Student stu = stuList.get(i);
            System.out.println(stu.getName()+"..."+stu.getAge());
        }
    }
        //返回一个学生类型的对象
        public static Student getStudent() {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入学生的姓名：");
            String name = sc.next();
            System.out.println("请输入学生的年龄：");
            int age = sc.nextInt();
            Student stu = new Student(name, age);
            return stu;
        }
}
