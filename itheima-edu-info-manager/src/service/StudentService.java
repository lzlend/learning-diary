package service;

import dao.StudentDao;
import domian.Student;

/**
 * Created by Administrator on 2021-02-18.
 */
public class StudentService {
    //创建私有的StudentDao（库管）对象
    private StudentDao stuDao = new StudentDao();
    //添加学生信息方法
    public boolean addStudent(Student stu) {
        //2.将学生对象继续传递给StudentDao中的addStudent()方法；
        //3.将返回的boolean类型结果返还给StudentController
        return stuDao.addStudent(stu);
    }
    //查看学生信息方法
    public Student[] findAllStudent() {
        //1.调用StudentDao库管中的findAllStudent()方法，获取学生对象数组
        Student[] stus = stuDao.findAllStudent();
        //2.判断学生对象数组中是否有学生信息，有就返回地址，没有返回null
        //思路：数组中只要有一个不是null的元素就代表有学生信息
        boolean flag = false;
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if(student != null) {
                flag = true;
                break;
            }
        }
        if(flag) {
            //有学生信息
            return stus;
        }else {
            //没有信息
            return null;
        }
    }
    //删除学生信息方法
    public void deleteStudentById(String deleteId) {
        stuDao.deleteStudentById(deleteId);
    }
    //修改学生信息方法
    public void updateStudent(String updateId,Student newStu) {
        stuDao.updateStudent(updateId,newStu);
    }
    //判断学号是否存在方法
    public boolean isExists(String id) {
        //1.从StudentDao中获取存储学生对象的数组，调用findAllStudent()方法，该方法返回学生数组
        Student[] stus = stuDao.findAllStudent();
        //3.假设id在数组中不存在
        boolean exists = false;
        //2.遍历数组中的每一个学生对象，判断学号是否存在
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            //String stuId = student.getId();
            //2.1如果学生对象不为空并且该学生对象的id与student.getId()相匹配
            if(student != null && id.equals(student.getId())) {
                //学号存在
                exists = true;
                break;
            }
        }
        return exists;
    }
}
