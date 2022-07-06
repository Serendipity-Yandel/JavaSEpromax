package d4_Staric_Attation;

public class Test {
    //定义静态成员变量
    public static int onlineNumber;
    //实例成员变量
    private String name;


    public static void getMax(){
        //1.静态方法可以直接访问静态成员变量(类名.静态变量),不可以直接访问实例成员变量（可以间接访问）
        System.out.println(Test.onlineNumber);
        System.out.println(onlineNumber);
        inAdder();
        Test d=new Test();
        System.out.println(d.name);//间接访问实例成员变量

        //3.静态方法中不能出现this关键字
        //System.out.println(this);

    }
    public void run(){
        //2.实例方法可以直接访问静态静态成员变量，也可以访问实例成员变量
        System.out.println(Test.onlineNumber);
        System.out.println(onlineNumber);
        System.out.println(name);
        Test.getMax();//实例方法可以调用静态方法
        getMax();//类名可以省略



    }
    //静态成员方法
    public static void inAdder(){
        System.out.println("我们都在学习黑马程序员");
    }

    public static void main(String[] args) {
//        getMax();//可以直接调用静态方法
        Test t=new Test();
        t.run();//实例方法要用对象调用
//        inAdder();
    }
}
