package d2_Staric_Method;

public class Student {
    private static String name;

    /**
     * 实例方法 对象名.方法名
     */
    public void study(){
        System.out.println(this.name+"好好学习天天向上");//this可以省略
    }
    /**
     * 静态方法:有static修饰，属于类，可以被类和对象访问
     */
    public static void getMax(int a,int b){
        System.out.println(a>b?a:b);
    }

    public static void main(String[] args) {
        //1.类名.静态方法
        Student.getMax(20,34);
        //注意，同一个类中访问静态成员，可以省略类名不写
        getMax(200,133);

        //2.对象.实例方法
        //study直接调用会报错
        Student s=new Student();
        s.name="张三";
        s.study();

        //3.对象.静态方法(不推荐）
        s.getMax(234,14);
    }
}
