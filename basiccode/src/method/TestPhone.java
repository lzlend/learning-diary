package method;

/**
 * Created by Administrator on 2021-01-31.
 */
public class TestPhone {
    public static void main(String[] args) {
        Phone dt = new Phone();
        dt.setBrand("小米");
        //dt.getBrand();
        //System.out.println(dt.getBrand());//小米
        dt.setPrice(3998);
        //dt.getPrice();
        //System.out.println(dt.getPrice());//3998
        dt.setColor("黑色");
        //dt.getColor();
        //System.out.println(dt.getColor());//黑色
        dt.call();
        dt.sendMessage();
    }
}
