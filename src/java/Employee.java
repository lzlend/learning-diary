public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    public Employee(String name){
        this.name = name;
    }
    public void setAge(int age ) {
        this.age = age;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public  void setSalary(double salary) {
        this.salary = salary;
    }
    public void printEmployee(){
        System.out.println("雇员的名字:"+name);
        System.out.println("雇员的年龄:"+age);
        System.out.println("雇员的职位:"+designation);
        System.out.println("雇员的工资:"+salary);
    }
}
