package d5_Staric_codeBlock;

public class Test2 {
    /**
     * 属于对象的，与对象一起加载，自动触发进行，优先于构造器
     */
    {
        System.out.println("==构造代码块被触发执行一次==");
    }
     //无参构造器
    public Test2() {
        System.out.println("构造器被执行");
    }


    public static void main(String[] args) {
    new Test2();
    }
}
