package day14;

import java.util.ArrayList;
import java.util.List;

/**
 * 在不创建新集合的前提下,将集合倒序
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);//[one, two, three, four, five]
        //倒序操作
        for (int i = 0; i < list.size()/2; i++) {
            //获取倒数位置对应的元素
            String e = list.get(list.size()-1-i);
            //将倒数元素设置到正数位置上，并获取原位置元素
            e = list.set(i,e);
            //再将原正数位置元素设置到倒数位置上完成交换
            list.set(list.size()-1-i,e);
        }

        System.out.println(list);//[five, four, three, two, one]
    }
}
