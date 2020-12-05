package employee;

public class EmployeeOne {

    private static String nameEmployee;
    protected static int numEmployee;
    public void setNameEmployee(String name) {
        nameEmployee = name;
    }
    public static String getNameEmployee() {
        return nameEmployee;
    }
    public void setNumEmployee(int num) {
        numEmployee = num;
    }
    public static int getNumEmployee() {
        return numEmployee;
    }

    public void printEmployeeOne() {
        System.out.println(nameEmployee);
        System.out.println(numEmployee);
        System.out.println("-------------------------");
        System.out.println(getNameEmployee());
        System.out.println(getNumEmployee());
    }
}
