public class WhileTest{

    public static void main(String[] args) {

        int i = 0;
        int sum = 0;

        while(i <= 100){

            if(i%2 == 1){
                sum += i;
                System.out.println("1-100的奇数有："+i);
            }

            i++;
        }

        System.out.println("1-100中所有奇数的和为："+sum);
    }
}