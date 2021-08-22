package day14;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List 线性表
 *  List是Collection中常用的子接口,是一个可以重复的集合.
 *  特点:有序. 提供了一套通过下标操作元素的方法.
 *
 *  常用实现类:
 *   java.util.ArrayList:内部是由数组实现
 *   java.util.LinkedList:内部是由链表实现
 *
 *  ArrayList:相对查询性能好,增删元素慢
 *  LinkedList:相对增删元素快,查询元素慢
 *
 *  对性能没有极端苛刻要求的情况下,通常使用ArrayList
 *
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        System.out.println(list);

        /*
        E get(int index) 获取指定位置对应的元素
         */
        String str = list.get(1);
        System.out.println(str);//two
        //传统for循环可以遍历List集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        /*
        E set(int index,E e)
         将给定元素设置到指定位置,返回值为原位置对应的元素(替换元素操作)
         */
        System.out.println(list);
        String old = list.set(1,"2");
//        String old = list.set(3,"4");//IndexOutOfBoundsException
        System.out.println(list);
        System.out.println(old);
    }
}







