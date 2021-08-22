package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转集合
 *  Arrays(数组工具类)提供了一个静态方法asList，可以将给定的数组转换为一个List集合
 */
public class ArrayToListDemo {
    public static void main(String[] args) {

        String[] arr ={"one","two","three","four"};

        List<String> list = Arrays.asList(arr);
        System.out.println(list);

        //对该集合的操作就是对原数组的操作
        list.set(1,"2");
        System.out.println(list);
        System.out.println(Arrays.toString(arr));

        //数组是定长的，所以集合增删元素的操作不支持的，会抛出异常
//        list.add("five");
//        System.out.println(list);
//        System.out.println(Arrays.toString(arr));

        /*
        若想对转换的结合元素增删，只能自行创建一个集合并包含该集合元素

        所有集合都提供一个参数为Collection的构造方法，
        可以在创建当前集合的同时包含给定集合中的所有元素。
         */
        List<String> list1 = new ArrayList<>(list);
        System.out.println(list1);
        list1.add("five");
        System.out.println(list1);


    }
}


