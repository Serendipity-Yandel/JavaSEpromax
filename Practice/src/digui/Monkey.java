package digui;

/**
 猴子第一天摘下若干桃子，当即吃了一半，觉得好不过瘾，于是又多吃了一个
 第二天又吃了前天剩余桃子数量的一半，觉得好不过瘾，于是又多吃了一个
 以后每天都是吃前天剩余桃子数量的一半，觉得好不过瘾，又多吃了一个
 等到第10天的时候发现桃子只有1个了。
 需求：请问猴子第一天摘了多少个桃子？

 分析：
 整体来看，每一天都是做同一个事件，典型的规律化问题，考虑递归三要素：
 递归公式：       f(n+1)=1/2f(n)-1 =====>f(n)=2f(n+1)+2
 递归终结点：  第10天
 递归方向：    向上

 */
public class Monkey {
    public static void main(String[] args) {
        System.out.println("第一天摘了"+f(1)+"个桃子");

    }
    public static int f(int n){
        if(n==10){
            return 1;
        }else{
            return 2*f(n+1)+2;
        }

    }

}
