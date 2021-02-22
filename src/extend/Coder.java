package extend;

/**
 * Created by Administrator on 2021-02-22.
 */
public class Coder extends Employee {
    public Coder() {

    }
    public Coder(String name,String id,double salary) {
        super(name,id,salary);
    }

    //重写父类Employee中的work方法
    @Override
    public void work() {
        System.out.println("姓名为:"+super.getName()+","+"工号为:"+super.getId()+","+"工资为:"+super.getSalary()+",的程序员正在写代码");
    }
}
