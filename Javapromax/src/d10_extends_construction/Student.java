package d10_extends_construction;

public class Student extends People {
    private String className;
    //创建无参构造器
    public  Student(){
    }

    public Student(String name,int age,String className){
    super(name,age);//子类访问父类
    this.className=className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
