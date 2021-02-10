package array;

/**
 * Created by Administrator on 2021-02-01.
 */
public class Demo3Array {
    public static void main(String[] args) {
        int[][] arr = new int[][] {{11,22,33},{44,55,66}};
        int sum = 0;
        System.out.println(arr);
            for (int i = 0; i < arr.length; i++) {
                //int[] arr1 = arr[i];
                //System.out.println(arr1);
                for (int j = 0; j < arr[i].length; j++) {
                    //int arr2 = arr1[j];
                    int arr2 = arr[i][j];
                    System.out.println(arr2);
                    //sum += arr2;
                    sum += arr[i][j];
                }
            }
        System.out.println(sum);


    }


}
