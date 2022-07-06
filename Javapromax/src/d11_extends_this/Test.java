package d11_extends_this;

public class Test {
    public static void main(String[] args) {

        Student s=new Student("张三","黑马程序班");
        System.out.println(s.getName()+ s.getClassName());

        Student s2=new Student("李四");
        System.out.println(s2.getName()+ s2.getClassName());

    }
}
