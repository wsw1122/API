package day15;

import java.util.ArrayList;
import java.util.List;

/**
 * 获取子集
 */
public class ListDemo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        /*
        List subList(int start,int end)
         获取指定范围内的子集（含头不含尾）
         */
        //获取2-7元素
        List<Integer> sub = list.subList(2,8);
        System.out.println(sub);
        //将子集每个元素扩大10倍
        for (int i = 0; i < sub.size(); i++) {
            int num = sub.get(i);
            num = num*10;
            sub.set(i,num);
        }
        System.out.println(sub);//[20,30,40,50,60,70]
        //操作子集就是操作原集合对应的元素
        System.out.println(list);
        /*
        删除list中 2-8 元素
         */
        list.subList(2,9).clear();
        System.out.println(list);
    }
}






