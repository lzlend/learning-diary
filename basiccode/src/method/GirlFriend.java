package method;

/**
 * Created by Administrator on 2021-02-01.
 */
public class GirlFriend {
    private String name;
    private double height;
    private double weight;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    public void wash() {
        System.out.println("女朋友"+"帮我洗衣服");
    }
    public void cook() {
        System.out.println("女朋友"+"给我做饭");
    }
    public void show() {
        System.out.println("我女朋友叫"+name+"，身高"+height+"厘米"+"，体重"+weight+"斤");
    }
}
