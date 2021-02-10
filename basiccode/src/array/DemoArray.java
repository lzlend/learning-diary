
package array;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Administrator on 2021-01-28.
 */
public class DemoArray {
    public static void main(String[] args) {
        //1.动态初始化一个长度为6的数组。
        int[] arr = new int[6];
        //2.键盘录入6个评委的评分
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个评委的评分：");
            Scanner sc = new Scanner(System.in);
            int score = sc.nextInt();
            if(score < 0 || score > 100) {
                //当输入的评分不在0-100范围内，给出提示，并重新输入，此时需要退回到输入第i-1个评委的评分！
                System.out.println("您输入的评分有误，请重新输入：");
                i--;
            } else {
                //将6位评委的分数放入数组arr[]中
                arr[i] = score;
            }
        }
        //3.找到数组元素的最大值max
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("该选手的最高得分为："+max);
        //4.找到数组元素的最小值min
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("该选手的最低得分为："+min);
        //5.遍历数组并求和数组元素
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("6位评委的总分为："+sum);
        //6.计算该选手的分数并打印
        int getScore = (sum - max - min) / 4;
        System.out.println("该选手的最终得分为："+getScore);
    }
}