package string;

import domain.Student;
import java.util.Scanner;

/**
 * Created by Administrator on 2021-02-07.
 */
public class Demo3String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("请输入一个11位的电话号码：");
        String str = sc.nextLine();
        String str1 = str.substring(0,3);
        String str2 = str.substring(7);
        System.out.println(str1+"****"+str2);

        System.out.println("请输入一个字符串：");
        String str3 = sc.nextLine();
        String str4 = str3.replace("TMD","***");
        System.out.println(str4);*/

        /*System.out.println("请输入一个字符串：");
        String str5 = sc.nextLine();
        String[] sArr = str5.split(",");
        Student stu = new Student(sArr[0],sArr[1]);
        System.out.println(stu.getName()+"..."+stu.getAge());*/

        System.out.println("请输入一个字符串：");

        StringBuilder sb = new StringBuilder();
        System.out.println("---------------------------------");
        System.out.println(sb.append("111").append("222"));
        System.out.println(sb.reverse());
        //String str = sb.append(333);//Error:(35, 31) java: 不兼容的类型: java.lang.StringBuilder无法转换为java.lang.String
        String str = sb.append(333).toString();
        System.out.println(str);

    }
}