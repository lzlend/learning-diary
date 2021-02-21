package java.employee;

public class EmployeeTest {
    public static void main (String[] args){
        //创建Employee类的两个具体对象
        Employee employee = new Employee("张三");
        Employee employee1 = new Employee("李四");
        //调用这两个对象的成员方法
        employee.setAge(28);
        employee.setDesignation("高级程序员");
        employee.setSalary(25000);
        employee.printEmployee();

        System.out.println("-----------------");

        employee1.setAge(20);
        employee1.setDesignation("初级程序员");
        employee1.setSalary(10000);
        employee1.printEmployee();
    }

}
