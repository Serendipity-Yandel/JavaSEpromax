package d10_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer>maps=new HashMap<>();
        maps.put("张三",17);
        maps.put("李三",16);
        maps.put("刘三",19);
        maps.put("王三",16);
        /**
         遍历map思想都为，通过键值来获得value
         */
//        Set<String> keys= maps.keySet();//获取键值
//        for(String key :keys){
//            int value=maps.get(key);
//            System.out.println(key+value+"岁");
//        }
//
//        Set<String> keys= maps.keySet();//获取键值
//        Iterator iterator= keys.iterator();//迭代器中的键值
//        while(iterator.hasNext()){
//            Object obj=iterator.next();//获得keys中的键值
//            Object value=maps.get(obj);//通过键值来获得value
//            System.out.println(obj+":"+value);
//        }

        Set entrySet =maps.entrySet();
        Iterator iterator=entrySet.iterator();//获取iterator对象
        while(iterator.hasNext()){
            Map.Entry entry=(Map.Entry)(iterator.next());
            Object key=entry.getKey();//获取entry中的键
            Object Value=entry.getValue();//获取entry中的值
            System.out.println(key+":"+Value);
        }

    }
}
