package d3_regex;

import java.util.Scanner;

    /**
        正则表达式
    */
public class RegexTest {
    public static void main(String[] args) {
        //目标 验证  手机号码 邮箱 电话号码
//        cheekPhone();
//        cheekEmail();
        cheekTellPhone();

    }
    //验证电话号码
    public static void cheekTellPhone(){
        System.out.println("输入您注册的电话号码");
        Scanner sc=new Scanner(System.in);
        while (true) {
            String tellPhone=sc.next();
            //判断邮箱是否正确
            //***数字**@***字母***.****.***
            if(tellPhone.matches("0\\d{2,6}-?\\d{5,20}")){
                System.out.println("电话号码格式正确，注册成功");
                break;
            }else{
                System.out.println("您输入的电话号码有误");
            }
        }

    }
    //验证邮箱
    public static void cheekEmail(){
        System.out.println("输入您注册的邮箱");
        Scanner sc1=new Scanner(System.in);
        while (true) {
            String email=sc1.next();
            //判断邮箱是否正确
            //***数字**@***字母***.****.***
            if(email.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}")){
                System.out.println("邮箱格式正确，注册成功");
                break;
            }else{
                System.out.println("您输入的邮箱有误");
            }
        }

    }
    //验证手机号码
    public static void cheekPhone(){
        System.out.println("输入您注册的手机号码");
        Scanner sc=new Scanner(System.in);
        while (true) {
            String phone=sc.next();
            //判断手机号码是否正确
            if(phone.matches("1[3-9]\\d{9}")){
                System.out.println("手机号码格式正确，注册成功");
                break;
            }else{
                System.out.println("您输入的号码有误");
            }
        }

    }
}
