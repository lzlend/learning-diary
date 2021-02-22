package employee;

public class EmployeeTwo {

    private static String nameEmployeeTwo;
    protected static int numEmployeeTwo;
    public void setNameEmployeeTwo(String name) {
        nameEmployeeTwo = name;
    }
    public static String getNameEmployeeTwo() {
        return nameEmployeeTwo;
    }
    public void setNumEmployeeTwo(int num) {
        numEmployeeTwo = num;
    }
    public static int getNumEmployeeTwo() {
        return numEmployeeTwo;
    }

    public void printEmployeeTwo() {
        System.out.println(nameEmployeeTwo);
        System.out.println(numEmployeeTwo);
        System.out.println("-------------------------");
        System.out.println(getNameEmployeeTwo());
        System.out.println(getNumEmployeeTwo());
    }

    public static void main(String[] args) {
        System.out.println(EmployeeTwo.nameEmployeeTwo);
        System.out.println(EmployeeTwo.numEmployeeTwo);
        System.out.println("--------------------------");
        EmployeeTwo pt = new EmployeeTwo();
        pt.setNameEmployeeTwo("中国人");
        pt.setNumEmployeeTwo(1);
        pt.printEmployeeTwo();
    }
}
