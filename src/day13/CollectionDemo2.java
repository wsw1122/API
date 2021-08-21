package day13;

import day04.Point;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 向集合中添加Point类型的对象
 */

public class CollectionDemo2 {

    public static void main(String[] args) {

        Collection c=new ArrayList();
        c.add(new Point(15,7));
        c.add(new Point(8,12));
        c.add(new Point(2,5));
        c.add(new Point(7,19));
        c.add(new Point(11,10));
        System.out.println(c);
        /**
         * 判断集合中是否包含一个元素
         * boolean contains(Object o)
         * 返回值为true表示集合中包含参数给定的元素
         * 返回false表示不包含
         * 原理是判断参数o和集合中所有元素进行equals比较
         * 如果其中任何一个元素返回equals结果为true表示包含
         */
        Point p=new Point(2,5);
        boolean contains=c.contains(p);
        System.out.println(contains);

        /**
         * 删除集合中的元素
         * boolean remove(Object o)
         * 返回的boolean表示删除是否成功
         * 如果集合中有和o对比一致的元素,会将这个元素删除并返回true
         * 这里的对比一致,指的也是equals方法对比的结果
         */
        c.remove(p);
        System.out.println(c);

    }

}
