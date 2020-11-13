public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    public Employee(String name){
        this.name = name;
    }
    public void empAge(int empAge ) {
        age = empAge;
    }
    public void empDesignation(String empDesign) {
        designation = empDesign;
    }
    public double getSalary(double salary) {
        return this.salary;
    }
    public void printEmployee(){
        System.out.println("雇员的名字"+name);
        System.out.println("雇员的年龄"+age);
        System.out.println("雇员的职位"+designation);
        System.out.println("雇员的工资"+salary);
    }
}
