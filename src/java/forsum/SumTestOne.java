package forsum;

public class SumTestOne {
    public static void main(String[] args) {
//      int result = sum(100);
//      System.out.println("1到100的和为" + result);
        System.out.println("1到100的和为"+sum(100));
        short m = 10;
        System.out.println("1到10的和为"+sum(m));
    }
//  public void sum() {
//  }

    public static int sum(int j) {
        int sum = 0;
        for (int i = 0; i <= j; i++) {
            sum += i;
        }
        return sum;
    }

    public static short sum(short k) {
        short sum = 0;
        for (int i = 0; i <= k; i++) {
            sum += i;
        }
        return sum;
    }
}
