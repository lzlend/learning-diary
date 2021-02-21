package entry;

import controller.StudentController;
import controller.TeacherController;

import java.util.Scanner;

/**
 * Created by Administrator on 2021-02-18.
 */
public class InfoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("---------------欢迎来到黑马信息管理系统--------------");
            System.out.println("请输入您的选择：1.学生管理系统 2.老师管理系统 3.退出");
            String choice = sc.next();

            switch (choice){
                case "1":
                    System.out.println("进入学生管理系统");
                    StudentController studentController = new StudentController();
                    studentController.start();
                    break;
                case "2":
                    System.out.println("进入老师管理系统");
                    TeacherController teacherController = new TeacherController();
                    teacherController.start();
                    break;
                case "3":
                    System.out.println("感谢您的使用!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入：");
            }
        }
    }
}
