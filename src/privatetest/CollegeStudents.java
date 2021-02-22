package privatetest;

public class CollegeStudents extends Student {
    public static void main(String[] args) {
        CollegeStudents cs = new CollegeStudents();
        //验证protected可以在同一包下的子类中调用
        System.out.println(cs.coursetest("物理"));
    }

}
