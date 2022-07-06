package finaExamAllTests;

import java.util.Random;
import java.util.Scanner;

public class Example2_5 {
    public static void main(String[] args) {
        //1-剪刀 2-石头 3-布
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int a=0;//玩家赢得场次
        int b=0;//平局
        for (int i = 0; i < 5; i++) {
            System.out.println("第"+(i+1)+"局");
            int number= random.nextInt(3)+1;//生成1,2,3 随机数
            String n=scanner.next();
            if (n.equals("剪刀")){
                if (number==1){
                    System.out.println("电脑出的是剪刀");
                    System.out.println("打平了");
                    b++;
                }else if (number==2){
                    System.out.println("电脑出的是石头");
                    System.out.println("你输了");
                }else if (number==3){
                    System.out.println("电脑出的是布");
                    System.out.println("你赢了");
                    a++;
                }
            }else if (n.equals("石头")){
                if (number==1){
                    System.out.println("电脑出的是剪刀");
                    System.out.println("你赢了");
                    a++;
                }else if (number==2){
                    System.out.println("电脑出的是石头");
                    System.out.println("打平了");
                    b++;
                }else if (number==3){
                    System.out.println("电脑出的是布");
                    System.out.println("你输了");
                }
            }else if (n.equals("布")){
                if (number==1){
                    System.out.println("电脑出的是剪刀");
                    System.out.println("你输了");
                }else if (number==2){
                    System.out.println("电脑出的是石头");
                    System.out.println("你赢了");
                    a++;
                }else if (number==3){
                    System.out.println("电脑出的是布");
                    System.out.println("打平了");
                }
            }else {
                System.out.println("你输入的内容有误");
            }
        }
        System.out.println("你赢了"+a+"场，"+"平了"+b+"场");

    }
}
