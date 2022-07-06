package finaExamAllTests;

import java.util.*;

public class Example6_4 {
    public static void main(String[] args) {
        //准备花色
        List<String>color=new ArrayList<>();
        color.add("♠");
        color.add("♥");
        color.add("♦");
        color.add("♣");

        //准备数字
        List<String> number=new ArrayList<>();
        for (int i=2;i<=10;i++){
            number.add(i+"");
        }
        number.add("J");
        number.add("Q");
        number.add("K");
        number.add("A");
        //定义map集合,牌的编号key-->index   value-->thisNumber+thisColor
        Map<Integer,String>map=new HashMap<>();
        int index=0;
        //组合数字和花色
        for(String thisNumber: number){//循环纸牌数字
            for (String thisColor:color){//循环花色
                map.put(index++,thisNumber+thisColor );
            }
        }
        //加入大小王
        map.put(index++,"小☺");
        map.put(index++,"大☻");
        //定义index作为牌的序号
        List<Integer>cards=new ArrayList<>();
        for (int i = 0; i < 54; i++) {
            cards.add(i);
        }
        //洗牌
        Collections.shuffle(cards);
        //创建3个玩家和底牌(序号）
        List<Integer>player1=new ArrayList<>();
        List<Integer>player2=new ArrayList<>();
        List<Integer>player3=new ArrayList<>();
        List<Integer>lastCard=new ArrayList<>();
        //发牌(从cards集合中获得）
        for (int i = 0; i < cards.size(); i++) {
            if (i>=51){
                //底牌
                lastCard.add(cards.get(i));
            }else if(i%3==0){
                //玩家1
                player1.add(cards.get(i));
            }else if (i%3==1){
                //玩家2
                player2.add(cards.get(i));
            }else{
                //玩家3
                player3.add(cards.get(i));
            }
        }
        //对玩家手中的牌的序号排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        //定义实际牌
        List<String>play1=new ArrayList<>();
        List<String>play2=new ArrayList<>();
        List<String>play3=new ArrayList<>();
        List<String>lastCards=new ArrayList<>();

        //  通过键值（序号），寻找value（牌）
        for(Integer key:player1){
            play1.add(map.get(key));
        }
        for(Integer key:player2){
            play2.add(map.get(key));
        }
        for(Integer key:player3){
            play3.add(map.get(key));
        }
        for(Integer key:lastCard){
            lastCards.add(map.get(key));
        }
        //输出牌
        System.out.println("玩家1:"+play1);
        System.out.println("玩家2:"+play2);
        System.out.println("玩家3:"+play3);
        System.out.println("底牌:"+lastCards);
    }
}
