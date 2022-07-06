package AllTests_classes;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arrays{
    public static void main(String[] args) {
        Random ran = new Random();
        int[] arr = new int[10];
        //随机产生10个随机数
        for (int i = 0;i < arr.length;i++){
            arr[i] = ran.nextInt(101);
        }
        for (int i:arr){
            System.out.println(i);

        }
        //将判断得倒数返回到list中
        List<Integer> list = funtion(arr);
        System.out.println(list);
    }
    public static List<Integer> funtion(int[] arr){
        List<Integer> list = new ArrayList<>();
        for (int i:arr){
                if(i>=10)
                list.add(i);
        }
        return list;
    }
}


