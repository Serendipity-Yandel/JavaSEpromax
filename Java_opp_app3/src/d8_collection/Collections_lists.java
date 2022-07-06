package d8_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collections_lists {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add(0,"张三");
        list.add(1,"李四");
        list.add(2,"王五");
        list.remove(2);
        list.set(1,"老六");
        for(String l:list){
            System.out.println(l);
        }
        System.out.println("===========================================");
        List<String>list2=new LinkedList<>();
        list2.add("张三六");
        list2.add("张老");
        list2.add("发哥");
        list2.add("发哥");
        list2.add("薛之谦");

        System.out.println(list2.toString());

        //第一种方法删除集合中的元素
        Iterator it =list2.iterator();//创建迭代器
        while(it.hasNext()){
            Object obj=it.next();//将集合元素加入迭代器
            if("发哥".equals(obj)) {//判断迭代器中是否有发哥
                it.remove();
            }
        }
        System.out.println(list2);

        //第二种方法
        for (int i = 0; i < list2.size(); i++) {
            String s=list2.get(i);
            if("发哥".equals(s)){
                list2.remove("发哥");
                i--;
            }
        }
        System.out.println(list2);

        //第三种方法
        for (int i =list.size()-1; i >=0 ; i--) {
            String s2=list2.get(i);
            if("发哥".equals(s2)){
                list2.remove("发哥");
            }

        }
        System.out.println(list2);




    }
}
