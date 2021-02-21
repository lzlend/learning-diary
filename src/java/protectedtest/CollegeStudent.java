package java.protectedtest;

import java.privatetest.Student;

public class CollegeStudent extends Student {
    public static void main(String[] args) {
        CollegeStudent cst = new CollegeStudent();
        //验证protected可以在不同包下的子类中调用
        System.out.println(cst.coursetest("地理"));
    }
}
