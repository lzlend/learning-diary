package java.forsum;

public class SumTest {
    public static void main (String [] args){
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            sum += i;
        }
        System.out.println("1到100的和为"+sum);
    }
}


