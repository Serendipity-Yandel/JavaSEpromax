package allFinalTests;

public class Student {

    private int  id;
    private String sex;
    private  int age;

    public Student() {
    }

    public Student(int id, String sex, int age) {
        this.id = id;
        this.sex = sex;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
