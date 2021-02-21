package dao;

import domian.Teacher;

/**
 * Created by Administrator on 2021-02-20.
 */
public class TeacherDao {
    //创建私有的静态老师对象数组
    private static Teacher[] teachers = new Teacher[5];
    //添加老师
    public boolean addTeacher(Teacher teacher) {
        //1.遍历Teacher[]
        int index = -1;
        for (int i = 0; i < teachers.length; i++) {
            Teacher tch = teachers[i];
            //2.判断数组中的元素是否为空
            if(tch == null) {
                index = i;
                break;
            }
        }

        if(index == -1) {
            //装满了
            return false;
        }else {
            //没装满，将封装好的teacher对象添加到数组null元素的位置
            teachers[index] = teacher;
            return true;
        }
    }
    //查看老师信息方法
    public Teacher[] findAllTeacher() {
        return teachers;
    }
}
