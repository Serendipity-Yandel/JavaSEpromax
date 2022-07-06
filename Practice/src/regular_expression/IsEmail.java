package regular_expression;

import java.util.Scanner;

public class IsEmail {
    public static void main(String[] args) {
        isEmail();
    }
    //验证邮箱
    public static void isEmail(){
        System.out.println("输入您注册的邮箱");
        Scanner sc1=new Scanner(System.in);
        while (true) {
            String email=sc1.next();
            //判断邮箱是否正确
            //***数字**@***字母***.****.***
            if(email.matches("\\w{1,9}@[a-zA-Z0-9]{2,10}(\\.[a-zA-Z0-9]{2,10}){1,2}")){
                System.out.println("邮箱格式正确，注册成功");
                break;
            }else{
                System.out.println("您输入的邮箱有误");
            }
        }

    }
}
