package method;

/**
 * Created by Administrator on 2021-02-01.
 */
public class TestManagerCoder {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("项目经理");
        manager.setId(123);
        manager.setSalary(15000);
        manager.setBonus(6000);
        manager.work();

        Coder coder = new Coder("程序员",135,10000.0);
        coder.work();
    }
}
