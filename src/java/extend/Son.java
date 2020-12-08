package extend;

public class Son extends Father {
    public static void main(String[] args) {
        //instanceof运算符，左边变量应为对象，右边为类或者接口
        String name = "Jams";
        Son son = new Son();
        Father father = new Father();
        //boolean result2 = Son instanceof Father;//左边变量为类，报错！
        //boolean result = son instanceof father;//右边变量为对象，报错~
        boolean result = son instanceof Father;
        boolean result1 = son instanceof GrandFather;
        System.out.println(result);
        System.out.println(result1);
    }

}
