package array;

/**
 * Created by Administrator on 2021-02-01.
 */
public class Demo2Array {
    double[] arr = new double[] {10.4,-3,-6.2,1.32,-6.1,-19,-3.8,0.9,-4.5,5.5};
    public void printArray() {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            double b = arr[i];
            if(b >= 0) {
                count1++;
            }else {
                count2++;
            }
        }
        System.out.println("赚钱的股票一共有："+count1+"只");
        System.out.println("赔钱的股票一共有："+count2+"只");
    }
}
