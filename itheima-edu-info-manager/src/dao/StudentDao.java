package dao;

import domian.Student;

/**
 * Created by Administrator on 2021-02-18.
 */
public class StudentDao {
    //创建私有的静态学生数组对象
    private static Student[] stus = new Student[5];
    //添加学生方法
    public boolean addStudent(Student stu) {
        //2.将学生对象添加到数组中
        //2.1定义索引index = -1，假设数组全部装满，没有null元素
        int index = -1;
        //2.2遍历数组的中每一个元素，判断是否是null
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            //2.3如果为null，让index记录当前索引位置，并用break结束循环
            if(student == null) {
                index = i;
                break;
            }
        }
        //3.返回是否添加成功的boolean值
        if(index == -1) {
            //数组装满了
            return false;
        }else {
            //数组没装满，正常添加
            stus[index] = stu;
            return true;
        }
    }
    //查看学生方法
    public Student[] findAllStudent() {
        return stus;
    }
    //删除学生方法
    public void deleteStudentById(String deleteId) {
        //1.查找deleteId在容器中所在的索引位置
        int index = getIndex(deleteId);
        //2.将该索引位置的元素用null覆盖
        stus[index] = null;
    }
    //修改学生方法
    public void updateStudent(String updateId,Student newStu) {
        //1.找到updateId所在的索引位置
        int index = getIndex(updateId);
        //2.将新的学生对象newStu赋值给index所在的数组元素，完成替换
        stus[index] = newStu;
    }
    //根据id查找元素所在索引
    public int getIndex(String id) {
        //假设id所在索引为-1
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if(student != null && id.equals(student.getId())) {
                //找到索引了
                index = i;
                break;
            }
        }
        return index;
    }
}
