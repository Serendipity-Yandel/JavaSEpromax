package d8_extends_Test;

public class Test {
    public static void main(String[] args) {
        //1.创建一个对象
        Student s=new Student();
        s.setName("张三");
        s.setAge(19);
        s.setClassName("移动互联班");
        s.queryCourse();
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getClassName());
        s.writeInfo();
    }



}
