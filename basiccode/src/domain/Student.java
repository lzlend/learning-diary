package domain;

/**
 * Created by Administrator on 2021-02-07.
 */
public class Student {
    private String sid;
    private String name;
    private int age;
    private String birthday;
    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Student(String sid,String name,int age,String birthday) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSid(){
        return sid;
    }

    public void setBirthday(String birthday){
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }
}
