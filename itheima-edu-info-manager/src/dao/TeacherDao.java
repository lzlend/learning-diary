package dao;

import domian.Teacher;

/**
 * Created by Administrator on 2021-02-20.
 */
public class TeacherDao {
    //创建私有的静态老师对象数组
    private static Teacher[] teachers = new Teacher[5];

    //添加老师信息方法
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

    //删除老师信息方法
    public void deleteTeacherById(String id) {
        //1.查询id在数组中的位置
        int index = getIndex(id);
        //2.将index所在的元素用null替换
        teachers[index] = null;
    }

    //修改老师方法
    public void updateTeacher(String id, Teacher teacher) {
        //1.根据id找出在数组中的索引位置
        int index = getIndex(id);
        //2.根据id将新的teacher对象替换index所在的元素
        teachers[index] = teacher;
    }

    //根据id查找元素所在索引
    public int getIndex(String id) {
        //1.遍历Teacher[]
        int index = -1;
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            //2.判断数组中的元素是否为空并且是否与id相匹配
            if(teacher != null && teacher.getId().equals(id)) {
                //找到了
                index = i;
                break;
            }
        }
        //3.返回id对应的索引值
        return index;
    }

}
