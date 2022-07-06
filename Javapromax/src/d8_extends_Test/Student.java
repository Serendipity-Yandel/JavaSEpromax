package d8_extends_Test;

public class Student extends Role {
    //独有属性
    private String className;

    //独有行为
    public void writeInfo(){
        System.out.println(getName()+"今天课程还行，老师666~~~");
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
