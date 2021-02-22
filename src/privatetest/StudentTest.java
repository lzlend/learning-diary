package privatetest;

public class StudentTest {
    public static void main(String [] args) {
        Student s = new Student();
        s.setNum(1);
        System.out.println(s.getNum());
        s.setOld(13);
        System.out.println(s.getOld());
        s.setName("李超");
        System.out.println(s.getName());
        //报错！num是Student类的私有的实例变量
        //s.num;
        //study是Student类中的静态方法，最好是使用类名.方法名的方式去调用
        System.out.println(s.study("语文"));
        System.out.println(Student.study("语文"));
        //验证protected可以同一包下的不同类中调用
        System.out.println(s.coursetest("数学"));
        System.out.println("-------------------------------");
    }
}
