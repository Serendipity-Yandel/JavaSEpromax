package regular_expression;

import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        cheekPhone();
    }
    //验证手机号码
    public static void cheekPhone(){
        System.out.println("输入您注册的手机号码");
        Scanner sc=new Scanner(System.in);
        while (true) {
            String phone=sc.next();
            //判断手机号码是否正确
            //1(0,1,2除外的任意数)....9位数。
            if(phone.matches("1[3-9]\\d{9}")){
                System.out.println("手机号码格式正确，注册成功");
                break;
            }else{
                System.out.println("您输入的号码有误");
            }
        }

    }
}
