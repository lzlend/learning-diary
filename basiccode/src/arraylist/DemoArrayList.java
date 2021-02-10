package arraylist;

import java.util.ArrayList;

/**
 * Created by Administrator on 2021-02-08.
 */
public class DemoArrayList {
    public static void main(String[] args) {
        testSet();
        testGet();
        ArrayList<String> list = new ArrayList<String>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        System.out.println(list);
        list.add(1,"666");
        System.out.println(list);
        int num = list.size();
        System.out.println(num);
    }
    public static String testSet() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        System.out.println(list);
        list.add(1,"666");
        System.out.println(list);
        String str = list.set(0,"888");
        System.out.println(str);
        System.out.println(list);
        return str;

    }
    public static String testGet() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        System.out.println(list);
        list.add(1,"666");
        System.out.println(list);
        String str = list.get(0);
        System.out.println(str);
        System.out.println(list);
        return str;
    }
    public static void testRemove(){
        /*ArrayList list = new ArrayList();
        list.add("abc");
        list.add(10);
        list.add(20.5F);
        list.add(100L);
        list.add(true);
        System.out.println(list);*/
        ArrayList<String> list = new ArrayList<String>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        System.out.println(list);
        list.add(1,"666");
        System.out.println(list);
        //list.add(20,"999");//索引越界异常IndexOutOfBoundsException: Index: 20, Size: 6
        boolean b1 = list.remove("222");//直接删除集合中的某个元素
        System.out.println(b1);
        boolean b2 = list.remove("888");
        System.out.println(b2);
        String b3 = list.remove(2);//删除集合中指定指引处的某个元素
        System.out.println(b3);

    }
}
