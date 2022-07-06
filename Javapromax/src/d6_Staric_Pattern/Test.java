package d6_Staric_Pattern;

public class Test {
    public static void main(String[] args) {
        Sing s1=Sing.instance;
        Sing s2=Sing.instance;
        Sing s3=Sing.instance;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s3);

    }

}
