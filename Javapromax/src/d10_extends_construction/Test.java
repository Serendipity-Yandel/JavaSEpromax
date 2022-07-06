package d10_extends_construction;

public class Test {
    public static void main(String[] args) {
        Student s=new Student("张三",23,"大学班");
        System.out.println(s.getName()+ s.getAge()+ s.getClassName());

    }
}
