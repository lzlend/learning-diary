import java.util.Random;
public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            //随机输出0-10中的一个随机数，但不包括10
            int num = r.nextInt(10);
            System.out.println("num:"+num);
        }
        System.out.println("-------------------");
        for (int j = 0; j < 100; j++) {
            //随机输出0-100中的一个随机数
            int num1 = r.nextInt(100)+1;
            System.out.println("num1:"+num1);
            if(num1 == 100) {
                System.out.println("恭喜你！在第"+j+"次找到100这个随机数了！");
                break;
            }else {
                System.out.println("很抱歉第"+j+"次的随机数为："+num1+",没有找到100这个随机数！");
            }
        }
//        System.out.println("-------------------");
//        for (int k = 0; k < 100; k++) {
//            随机输出0-100中的一个随机数
//            int num2 = r.nextInt(101);
//            System.out.println("num2:"+num2);
//        }
    }
}
