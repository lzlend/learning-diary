package arraylist;

import java.util.ArrayList;

/**
 * Created by Administrator on 2021-02-09.
 */
public class Demo2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String> ();
        list.add("test");
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("test");
        list.add("test");

        System.out.println(list);
        list.remove("test");//直接调用remove方法删除集合中的某个元素，只能删除一个元素
        System.out.println(list);
        //所以要删除集合中的某个元素，需要遍历集合中的所有元素，并与E进行比较，若相同就删除这个元素
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if("test".equals(s)) {
                list.remove(i);
                i--;//必须要加入i--才能保证集合中所有的元素E被删除掉，因为是根据索引去删除的，
                    //删除一个元素后自动补位，在索引i++后，补位的元素会错过匹配。
            }
        }
        System.out.println(list);
    }
}
