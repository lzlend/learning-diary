package string;
import java.util.Scanner;
/**
 * Created by Administrator on 2021-02-03.
 */
public class DemoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.print(ch+" ");
        }
    }
}