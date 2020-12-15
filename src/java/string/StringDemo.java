package string;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        char[] ch = {'S','t','r','i','n','g'};
        String str = new String(ch);
        System.out.println(ch);
        System.out.println(ch.length);
        //为什么输出的是地址值
        System.out.println(ch.toString());
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(3));
        System.out.println("---------------------");
        String str1 = "Hello";
        String str2 = "IelloWorld";
        String str3 = "HelloWorld";
        String str4 = "String";
        StringBuffer sb = new StringBuffer(String.valueOf(ch));
        System.out.println(sb);
        System.out.println(sb.append(str1));
        System.out.println(str1.concat(str2));
        //要知道compareTo方法比较的是什么，比较的范围 s = [0，min(str1.length，str2.length)]
        //在s范围内字符串相同，则比较的是剩余不同字符串的个数，若不同则比较的是字符串中每个字符的ASKII码值的差
        System.out.println(str1.compareTo(str3));
        System.out.println(str2.compareTo(str3));
        System.out.println(String.valueOf(ch).compareTo(str3));
        System.out.println(str);
        System.out.println(str.compareTo(str3));
    }
}
