package d5_Staric_codeBlock;

public class Test {
    public static String schoolName;

    /**
     特点：与类一起加载，自动触发一次，优先执行
     作用：可以在程序加载时进行静态数据的初始化（准备内容）
     */
    static{
        System.out.println("===输出静态代码块优先输出===");
    schoolName="黑马程序员";
    }


    public static void main(String[] args) {

        System.out.println(schoolName);
    }
}
