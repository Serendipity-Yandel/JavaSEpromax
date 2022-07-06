package register;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        ArrayList<login>counts=new ArrayList<>();
        while (true) {
            System.out.println("请输入你要进项的操作");
            System.out.println("====================");
            System.out.println();
            System.out.println("1，登录");
            System.out.println("2，注册");
            System.out.println("3，查看");
            System.out.println("4,退出");
            Scanner n = new Scanner(System.in);
            int number = n.nextInt();
            switch (number) {

                case 1:
                DengLu(counts,n);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;

                default:
            }
        }

    }
    public static void DengLu(ArrayList<login>counts,Scanner n  ){
        System.out.println("-----------------------------------");
        String name="";
        System.out.println("请输入账户名称");
         name=n.next();

        String passWord="";

        while (true) {

            System.out.println("请输入你的开户密码");
            passWord=n.next();

            System.out.println("请输入确定密码");
            String okPassWord="";
            okPassWord=n.next();

            if(okPassWord.equals(passWord)){
                System.out.println("密码正确，欢迎进入！！！");
                break;
            }else {
                System.out.println("两次的密码必须一致");
            }

        }



    }
}
