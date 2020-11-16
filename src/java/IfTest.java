import java.util.*;
public class IfTest {
    public static void main(String[] args) {

        System.out.println("本系统中天气：1代表晴天，0代表阴天");
        System.out.println("本系统中性别：1代表男性，0代表女性");
        System.out.println("本系统中温度用整数表示！");
        System.out.println("---------------------------------------------------");
        System.out.println("请输入今天的天气：");

        Scanner sc = new Scanner(System.in);
        int weather = sc.nextInt();

        if(weather == 0) {

            System.out.println("今天的天气是阴天，适合出门！");

            System.out.println("请输入您的性别：");
            int sex = sc.nextInt();

            if(sex == 1) {
                System.out.println("您是男性，阴天出门请带一把大黑伞！");
            }else if(sex == 0) {
                System.out.println("您是女性，阴天出门请带一把小花伞！");
            }else{
                System.out.println("您输入的性别不合法！");
            }

        }else if(weather == 1) {

            System.out.println("今天的天气是晴天，请做好防护措施再出门！");

            System.out.println("请输入今天的温度：");
            int temperature = sc.nextInt();

            if(temperature < 30) {

                System.out.println("温度适宜，请放心出门！");

            }else {
                System.out.println("今天温度很高！");
                System.out.println("请输入您的性别：");
                int sex = sc.nextInt();

                if(sex == 1) {
                    System.out.println("您是男性，请带好墨镜出门！");
                }else if(sex == 0) {
                    System.out.println("您是女性，请一定涂上防晒霜再出门！");
                }else{
                    System.out.println("您输入的性别有误！");
                }
            }

        }else{

            System.out.println("您输入的天气有误！");
        }

    }

}
