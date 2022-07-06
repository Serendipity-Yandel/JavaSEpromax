package AllTests_classes;

import java.util.HashSet;
import java.util.Set;

public class Peoples {
    public static void main(String[] args) {
        Set<Persons> sets=new HashSet<>();
        sets.add(new Persons("张三",19));
        sets.add(new Persons("赵四",20));
        sets.add(new Persons("赵四",21));


    }


}
