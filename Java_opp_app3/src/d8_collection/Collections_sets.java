package d8_collection;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Collections_sets {
    public static void main(String[] args) {
//        Set<String> sets=new HashSet<>();
//        sets.add("张三");
//        sets.add("李四");
//        sets.add("王五");
//        sets.add("张三");
//        sets.add("老六");
//        //第一种遍历
//        Iterator iterator=sets.iterator();
//        for(String str;iterator.hasNext();){
//            System.out.println(iterator.next());
//        }
//        System.out.println("====================================");
//        //第二种
//        while(iterator.hasNext()){
//            Object obj=iterator.next();
//            System.out.println(obj);
//        }
        Set<String> sets2 = new TreeSet<>();
        sets2.add("张三");
        sets2.add("李四");
        sets2.add("王五");
        sets2.add("张三");
        sets2.add("老六");
        System.out.println(sets2);

    }
}
