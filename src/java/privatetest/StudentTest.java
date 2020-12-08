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
        //s.num;
        //Student.study("语文");
    }
}
