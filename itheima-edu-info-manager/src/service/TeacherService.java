package service;

import dao.TeacherDao;
import domian.Teacher;

/**
 * Created by Administrator on 2021-02-20.
 */
public class TeacherService {
    private TeacherDao teacherDao = new TeacherDao();

    //添加老师
    public boolean addTeacher(Teacher teacher) {
        //将teacher继续传递给TeacherDao中的addTeacher方法
        return teacherDao.addTeacher(teacher);
    }

    //修改老师方法
    public void updateTeacher(String id,Teacher teacher) {
        teacherDao.updateTeacher(id,teacher);
    }

    //查看老师信息
    public Teacher[] findAllTeacher() {
        Teacher[] teachers = teacherDao.findAllTeacher();
        boolean flag = false;
        //1.遍历数组
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            if(teacher != null) {
                flag = true;
            }
        }
        if(flag) {
            //2.有老师信息，返回数组地址
            return teachers;
        }else {
            //3.没有老师信息，返回null
            return null;
        }
    }


    //删除老师信息
    public void deleteTeacherById(String id) {
        teacherDao.deleteTeacherById(id);
    }

    //判断id是否存在方法
    public boolean isExists(String id) {
        //1.找到容器中的所有对象
        Teacher[] teachers = teacherDao.findAllTeacher();
        boolean exists = false;
        //2.遍历数组
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            if(teacher != null && teacher.getId().equals(id)){
                //id存在
                exists = true;
                break;
            }
        }
        return exists;
    }

    //根据id查找元素所在索引
    public int getIndex(String id) {
        //1.遍历Teacher[]
        Teacher[] teachers = teacherDao.findAllTeacher();
        int index = -1;
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            //2.判断数组中的元素是否为空并且是否与id相匹配
            if(teacher != null && teacher.getId().equals(id)) {
                //找到了
                index = i;
            }else {
                //没有找到
                break;
            }
        }
        //3.返回id对应的索引值
        return index;
    }
}
