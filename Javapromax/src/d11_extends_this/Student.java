package d11_extends_this;

public class Student {
    private String name;
    private String className;

    public Student() {
    }
    //借用兄弟的构造器!
    public Student(String name){
        this(name,"江西大学班");

    }

    //创建有参构造器
    public Student(String name, String className) {
        this.name = name;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
