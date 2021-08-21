package day13;

import day04.Point;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {

    /**
     * java.util.Collection是集合中的父接口
     * 具体有实现类的接口是List和Set
     * List：有序(根据存放顺序保存)  不唯一
     * Set： 无序(保存数据和存放数据无关)  唯一
     * List常见实现类：ArrayList LinkedList
     * Set常见实现类：HashSet
     * @param args
     */
    public static void main(String[] args) {

        //Collection接口功能演示
        Collection c=new ArrayList();
        /**
         * 新增元素
         * boolean add(E e)
         * 功能是向集合中添加一个元素
         * 添加成功返回true,否则返回false
         * 方法的参数是要添加到集合中的数据
         */
        c.add("red");
        c.add("orange");
        c.add("yellow");
        c.add("green");
        c.add("cyan");
        c.add("blue");
        c.add("pink");
        System.out.println(c);

        /**
         * 获得当前元素的数量
         * int size();
         * 这个方法的返回值是当前集合中数据的数量
         */
        int size=c.size();
        System.out.println(size);

        /**
         * 检查是否为空集合
         * boolean isEmpty()
         * 返回真表示是空集,否则表示有元素
         */
        boolean isEmpty=c.isEmpty();
        System.out.println(isEmpty);

    }
}
