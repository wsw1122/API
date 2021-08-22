package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * 集合转数组
 *  Collection定义了一个方法toArray(),可以将当前集合转为数组
 */
public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        System.out.println(c);

//        Object[] arr = c.toArray();

        //数组长度够，用你的
        //数组长度不够，类型参照你的类型，长度是按照集合长度自适应
        String[] arr = c.toArray(new String[c.size()]);

        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

    }
}
