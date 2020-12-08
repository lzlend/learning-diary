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

    //private static String study(String course) {
    //    return course;
    //}

}
