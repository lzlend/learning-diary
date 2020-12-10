package privatetest;

public class Student {
    private int num;
    protected int old;
    public String name;

    public void setNum(int number) { num = number; }
    public int getNum() { return num; }

    public void setOld(int old) { this.old = old; }
    public int getOld() { return this.old; }

    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }
    //private修饰的变量、方法当且仅当只能在本类中调用
    //private static String study(String course) {
    //    return course;
    //}
    static String study(String course) {
        return course;
    }

    protected String coursetest(String courses) {
        return courses;
    }

}
