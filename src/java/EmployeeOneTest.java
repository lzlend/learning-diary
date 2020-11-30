public class EmployeeOneTest {

    public static void main(String[] args) {
        /*
        *nameEmployee为私有的静态变量，只有在当前类中才可以被调用，如：下面会报错！
        */
//        System.out.println(EmployeeOne.nameEmployee);
        System.out.println(EmployeeOne.numEmployee);
        System.out.println("--------------------------");
        EmployeeOne pt = new EmployeeOne();
        pt.setNameEmployee("中国人");
        pt.setNumEmployee(1);
        pt.printEmployeeOne();
    }
}
