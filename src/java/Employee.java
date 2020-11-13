public class Employee {
    String name;
    int age;
    String designation;
    double salary;
    //Employee类的构造方法
    public Employee(String name){
        this.name = name;
    }
    //设置雇员的年龄
    public void setAge(int age ) {
        this.age = age;
    }
    //设置雇员的职位
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    //设置雇员的工资
    public  void setSalary(double salary) {
        this.salary = salary;
    }
    //打印雇员的信息
    public void printEmployee(){
        System.out.println("雇员的名字:"+name);
        System.out.println("雇员的年龄:"+age);
        System.out.println("雇员的职位:"+designation);
        System.out.println("雇员的工资:"+salary);
    }
}
