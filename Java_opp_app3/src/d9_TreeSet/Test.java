package d9_TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet sets = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 1;
            }
        });
        sets.add(new Student_TreeSet("张三","12"));
        sets.add(new Student_TreeSet("李四","13"));
        sets.add(new Student_TreeSet("王五","15"));
        System.out.println(sets);
    }

}
