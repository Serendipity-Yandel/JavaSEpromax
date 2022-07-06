package arraysTest;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        System.out.println("请输入您的用户名(不是中文）");
        Scanner sc=new Scanner (System.in);
        String account=sc.next();

        String newCode=code(account);

        System.out.println("默认密码为"+newCode);

    }

    public static String code(String account){
        String recode="";
        //反向遍历
        for (int i=account.length()-1;i>=0;i--) {

            recode+=account.charAt(i);
        }

        return recode;
    }
}

