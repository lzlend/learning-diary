package string;

import java.util.Scanner;

/**
 * Created by Administrator on 2021-02-06.
 */
public class Demo2StringTest {
    public static void main(String[] args) {
        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        Demo2String d2s = new Demo2String();
        //2.接收统计字母和数字个数返回的数组
        int[] arr = d2s.countNum(str);
        //3.遍历数组并打印
        d2s.printArray(arr);
    }
}
