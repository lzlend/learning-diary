package extend;

public class Son extends Father {

    String name = "Jams";
    public void method() {
        String name = "Bob";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
        this.show();
        super.show();
    }
    public void show() {
        System.out.println("子类...show方法");
    }
}
