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
}
