package d2_exception;

import java.util.Scanner;

public class Exception_Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (true) {
            try {
                System.out.println("请您输入合法的价格");
                String priceStr=sc.nextLine();

                double price=Double.valueOf(priceStr); //转换成double型类的价格
                if(price>0){
                    System.out.println("定价"+price);
                    break;
                }else{
                    System.out.println("价格必须是正数");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();//输出异常结果
                System.out.println("用户输入的数据有毛病，请输入合法的正数~~~");
            }

        }


    }
}
