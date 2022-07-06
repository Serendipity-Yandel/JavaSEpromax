package d6_collection_update_delete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Update_Delete {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("黑马");
        list.add("java");
        list.add("java");
        list.add("张三");
        list.add("李四");
        System.out.println(list);

        /**
         目标，删除全部的java元素
         */
//        //1.迭代器遍历删除
//        Iterator<String> it= list.iterator();//多态      获取集合种的iterator对象
//        while(it.hasNext()){
//            String ele=it.next();
//            if("java".equals(ele)){
//                //list.remove("java");//会报漏删错误
//                it.remove();//删除当前所在元素，并不会向后发生位移
//            }
//
//        }
//        System.out.println(list);


        //2.foreach删除
//        for(String s :list){                 //会出现ConcurrentModificationException异常
//            if("java".equals(s)){
//                list.remove("java");
//            }
//        }
//        System.out.println(list);

        //3.lambda表达式
//        list.forEach( s -> {
//            if("java".equals(s)){               //也会出现像上面的异常
//                list.remove("java");
//            }
//        });
//        System.out.println(list);

        //4.for循环
//        for (int i = 0; i < list.size(); i++) {  //不出bug，但会漏删
//            String ele=list.get(i);
//            if("java".equals(ele)){
//                list.remove("java");//会报漏删错误
//            }
//        }
//        System.out.println(list);
        //for循环解决方案1
        for (int i =list.size()-1; i>=0 ; i--) {
            String ele=list.get(i);
            if("java".equals(ele)){
                list.remove("java");
            }
        }
        System.out.println(list);

        //for循环解决方案2
        for (int i = 0; i < list.size(); i++) {
            String ele=list.get(i);
            if("java".equals(ele)){
                list.remove("java");
                i--;
            }
        }
        System.out.println(list);
    }




}
