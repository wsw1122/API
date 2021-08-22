package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序字符串
 */
public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        /*
        对于已经实现comparable接口，但是自身定义的比较规则不满足我们排序要求，也
        可以额外提供一个比较器并按照该规则进行比较排序。
         */
        //按照字符串长度，排序(升序)
        Collections.sort(list, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println(list);

    }
}





