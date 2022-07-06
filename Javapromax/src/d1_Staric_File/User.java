package d1_Staric_File;

public class User {
    //在线人数，静态成员变量
    private  static int OnlineNumber=100;
    //实例成员变量
    private String name;
    private  int age;

    public static void main(String[] args) {
        //1.类名.静态成员变量
        User.OnlineNumber++;
        System.out.println(User.OnlineNumber);

        //2.对象.实例成员变量
        User u=new User();
        u.age=23;
        u.name="张三";
        System.out.println("我叫"+u.name+u.age+"了");


        User u2=new User();
        u2.name ="李四";
        u2.age=19;
        System.out.println("我叫"+u2.name+u2.age+"了");
        //对象.静态成员变量
        //u2.OnlineNember++;(不推荐，会报错）


    }
}


