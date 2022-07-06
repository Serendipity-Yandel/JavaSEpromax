package d5_Staric_codeBlock;
import java.util.ArrayList;

public class StaticCardsTest {

    //定义1个集合容器，分别装好扑克牌
    /**
     * 模拟初始化牌的操作
     *首先准备好一个容器，用来存储54张牌，建议使用静态的集合，使其加载一次
     */
    public static ArrayList<String> cards=new ArrayList<>();
    static{
        //定义花色♠,♥，♣，♦
    String [] colors={"♠","♥","♣","♦"};
        //定义数据
        String[]sizes={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        for (int i = 0; i < sizes.length; i++) {//控制行
            for (int j = 0; j < colors.length; j++) {//控制列
                cards.add(sizes[i]+colors[j]);
            }
        }
        //添加大小王
        cards.add("小🃏");
        cards.add("大🃏");
    }
    public static void main(String[] args) {
        System.out.println("新牌"+cards);
    }
}
