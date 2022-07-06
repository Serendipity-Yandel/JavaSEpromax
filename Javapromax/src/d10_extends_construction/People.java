package d10_extends_construction;

public class People {
    private String name;
    private int age;

    //创建无参构造器


    public People() {
    }

    //创建有参构造器
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
