import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        int[] arr = new int[] {11,22,33,44,55,66,77,88,99};
        //遍历数组元素
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("数组中的第"+(i+1)+"个元素为："+arr[i]);
//        }
        //foreach
        for (int k : arr) {
            String s = k + ",";
            System.out.print(s);
        }
        for (int n : arr) {
            String s1 = n + ",";
            System.out.println(s1);
        }
        System.out.println();
        //找出数组元素的最大值
        int[] arr1 = new int[] {2,5,6,1,3,7,9,8,0,4};
        int max = arr1[0];
        for (int j = 0; j < arr1.length; j++) {
            if(arr1[j] > max) {
                max = arr1[j];
            }
        }
        System.out.println("此数组中的最大值为："+max);
    }

}
