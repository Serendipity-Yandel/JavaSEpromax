package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddOrDeleteArrays {
    public static void main(String[] args) {
        int[] arr=new int[]{23,45,67,42};
        System.out.println(Arrays.toString(arr));//快速查看数组元素

        //创建一个新数组
        int []newArray=new int[arr.length+1];
        //要添加的元素
        int add=6;

        for (int i = 0; i <arr.length; i++) {
            newArray[i]=arr[i];
        }



        newArray[arr.length]=add;
        System.out.println(Arrays.toString(newArray));
    }

}
