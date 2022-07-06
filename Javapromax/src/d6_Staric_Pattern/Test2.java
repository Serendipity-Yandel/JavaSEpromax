package d6_Staric_Pattern;

public class Test2 {
    public static void main(String[] args) {
        Sing2 s1=Sing2.getInstance();
        Sing2 s2=Sing2.getInstance();
        Sing2 s3=Sing2.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s3);
    }
}
