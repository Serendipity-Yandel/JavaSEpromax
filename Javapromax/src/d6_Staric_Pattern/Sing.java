package d6_Staric_Pattern;

public class Sing {
    //1.把构造器私有起来
    private Sing(){

    }
    /**
     * 2.定义一个公开的静态成员变量   储存一个类的对象
     * public static int onlineNumber=160;
     */
    public static Sing instance=new Sing();




}

