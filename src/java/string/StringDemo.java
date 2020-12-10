package string;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        char [] ch = {'S','t','r','i','n','g'};
        String str = new String(ch);
        System.out.println(ch);
        System.out.println(ch.length);
        //为什么输出的是地址值
        System.out.println(ch.toString());
        System.out.println(str);
        System.out.println(str.toUpperCase());
    }
}
