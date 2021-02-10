package arraylist;

import domain.Student;

import java.util.ArrayList;

/**
 * Created by Administrator on 2021-02-09.
 */
public class Demo3ArrayList {
    /*
    * 需求：定义一个方法，方法接受一个集合对象，泛型为Student，
    * 方法内部将年龄低于18的学生对象找出，并存入新的集合对象，方法返回新集合
    *
    *
    * 思路：
    * 1.创建一个集合对象，泛型为Student类型，并添加具体的学生对象；
    * 2.创建一个新的集合对象，用于存储符合要求的学生对象；
    * 3.对原有集合对象遍历，判断找出年龄低于18的学生对象；
    * 4.将年龄低于18的学生对象添加到新的集合中；
    * 5.返回新的集合；
    * 6.在main方法中进行测试。
    * */

    public static void main(String[] args) {
        //1.创建一个集合对象，泛型为Student类型，并添加具体的学生对象；
        ArrayList<Student> list = new ArrayList<Student>();
        Student stu1 = new Student("张三",17);
        Student stu2 = new Student("李四",24);
        Student stu3 = new Student("王五",16);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        System.out.println(list);
        //6.在main方法中进行测试。
        //ArrayList<Student> newList = getList(list);//getList方法没有static修饰
        //无法从静态上下文中引用非静态 方法 getList(java.util.ArrayList<domain.Student>)
        ArrayList<Student> newList = getList(list);
        //7.遍历新集合中的学生对象，查看结果
        for (int i = 0; i < newList.size(); i++) {
            Student stu = newList.get(i);
            System.out.println(stu.getName()+"..."+stu.getAge());
        }
    }
    public static ArrayList<Student> getList(ArrayList<Student> list) {
        //2.创建一个新的集合对象，用于存储符合要求的学生对象；
        ArrayList<Student> newList = new ArrayList<Student>();
        //3.对原有集合对象遍历，判断找出年龄低于18的学生对象；
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            //4.将年龄低于18的学生对象添加到新的集合中；
            if(stu.getAge() < 18) {
                newList.add(stu);
            }
        }
        //5.返回新的集合；
        return newList;
    }
}
