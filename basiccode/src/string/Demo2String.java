package string;

/**
 * Created by Administrator on 2021-02-06.
 */
public class Demo2String {
    public Demo2String() {

    }
     public int[] countNum(String str) {
         int letterCount = 0;
         int numberCount = 0;
         //将数组中的字母转换成大写字母/或者小写字母,然后遍历字符串返回一个字符数组
         char[] ch = str.toUpperCase().toCharArray();
         for (int i = 0; i < ch.length; i++) {
            //判断字符串中的每个元素是英文字母还是数字并计数
            if(ch[i] >= 'A' && ch[i] <= 'Z') {
                letterCount++;
            }else if(ch[i] >= '0' && ch[i] <= '9'){
                numberCount++;
            }
        }
        int[] arr = {letterCount, numberCount};
//        System.out.println(count1);
//        System.out.println(count2);
        return arr;
    }

    //统计字符串中的英文字母和数字的个数，并生成一个数组返回
    /*public int[] countNum(String str) {
        int letterCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {

            //将数组中的字母转换成大写字母/或者小写字母,然后遍历返回字符串中的每一个元素
            char ch = str.toUpperCase().charAt(i);
//            Character ch1 = new Character(ch);
//            char ch2 = ch1.toUpperCase(ch);
            //判断字符串中的每个元素是英文字母还是数字并计数
            if(ch >= 'A' && ch <= 'Z') {
                letterCount++;
            }else if(ch >= '0' && ch <= '9'){
                numberCount++;
            }
        }
        int[] arr = {letterCount, numberCount};
//        System.out.println(count1);
//        System.out.println(count2);
        return arr;
    }*/

    //将数组中的元素遍历打印
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
