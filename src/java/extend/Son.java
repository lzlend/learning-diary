package extend;

public class Son extends Father {
    public static void main(String[] args) {
        //instanceof运算符
        String name = "Jams";
        Son son = new Son();
        Father father = new Father();
        //boolean result = son instanceof father;
        boolean result = son instanceof Father;
        System.out.println(result);
    }

}
