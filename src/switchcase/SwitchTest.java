package switchcase;

import java.util.*;
public class SwitchTest {
    public static void main(String[] args) {
        //一周的计划安排
        //周一：读书
        //周二：读书
        //周三：唱歌
        //周四：读书
        //周五：读书
        //周六：爬山
        //周日：游泳
        System.out.println("这是一个简单的一周计划安排小程序");
        System.out.println("如果你忘记了当天的计划输入今天是星期几就知道了");
        System.out.println("------------------------------------------");
        System.out.println("请输入今天是星期几，用1~7表示：");
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch(week){
            case 1: case 2:case 4:case 5:
                System.out.println("今天的计划是：读书");
                break;
            case 3:
                System.out.println("今天的计划是：唱歌");
                break;
            //case穿透现象
            case 6:
                System.out.println("今天的计划是：爬山");
              //break;
            case 7:
                System.out.println("今天的计划是：游泳");
                break;
            default:
                System.out.println("您输入的星期有误，请重新输入！");
        }
    }
}
