package d6_Staric_Pattern;
/**
 * 目标，学会使用懒汉单例模式设计单利类(懒汉模式）
 */
public class Sing2 {
    /**
     * 1.私有构造器
     */
    private Sing2(){
    }




    /**
     * 2.创建一个静态成员变量储存本类的对象      注意:不能初始化对象
     */
    public static Sing2 instance;//null





    /**
     * 3.定义一个方法，让其他地方可以来调用获取一个对象
     */
    public static Sing2 getInstance(){
        if (instance==null){
            instance=new Sing2();
        }
        return instance;
    }
}
