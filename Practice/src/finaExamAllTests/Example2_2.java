package finaExamAllTests;

import java.util.Scanner;

public class Example2_2 {
    /**
     * 书本-12  铅笔-1 橡皮-2 可乐-3 零食-5
     */
    public static void main(String[] args) {
        int money=8;//买书后剩余的钱
        int a=1;//铅笔
        int b=2;//橡皮
        int c=3;//可乐
        int d=5;//零食
        Scanner scanner =new Scanner(System.in);
        String goods= scanner.next();
switch (goods){
    case "铅笔":
        System.out.println("可以买"+money/a+"根铅笔"+"剩余"+money%a+"元");
        break;
    case    "橡皮":
        System.out.println("可以买"+money/b+"块橡皮"+"剩余"+money%b+"元");
        break;
    case"可乐":
        System.out.println("可以买"+money/c+"瓶可乐"+"剩余"+money%c+"元");
        break;
    case"零食":
        System.out.println("可以买"+money/d+"个零食"+"剩余"+money%d+"元");
        break;
    default:
        System.out.println("您输入的商品这里没有！！！");
}


    }
}
