package d6_collection_update_delete;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("李琦");

        //用迭代器删除李四
        Iterator<String> it=list.iterator();
        while(it.hasNext()){//hasNext()方法判断集合中是否有元素
            String ele=it.next();//next()方法用于取出集合中的元素
            if("李四".equals(ele)){
                it.remove();
            }
        }
        System.out.println(list);
        //高级遍历循环删除后的list
        for(String s :list){
            System.out.println(s);
        }

        }




}
