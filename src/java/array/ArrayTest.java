package array;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        int[] arr = new int[] {11,22,33,44,55,66,77,88,99};
        //遍历数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println("数组中的第"+(i+1)+"个元素为："+arr[i]);
        }
        //foreach
        int m = 0;
        for (int k : arr) {
            m = m + 1;
//            m++;
            System.out.println("数组中的第"+m+"个元素为："+k);
        }
        String s = "";
        for (int n : arr) {
            s = s + n + ",";
        }
        System.out.print(s.substring(0, s.length()-1));
        System.out.println();
        //找出数组元素的最大值
        int[] arr1 = new int[] {2, 5, 6, 1, 3, 7, 9, 8, 0, 4};
        // l表示数组中的最大值的下标
        int l = 0;
        for (int j = 1; j < arr1.length; j++) {
            if(arr1[j] > arr1[l]) {
                l = j;
            }
        }
        System.out.println("此数组中的最大值为："+arr1[l]+"，是第"+(l + 1)+"个元素");
    }

}
