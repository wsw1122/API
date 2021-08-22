package day15;

import java.util.*;

/**
 * 集合的工具类:java.util.Collections
 * 其提供了一个静态方法：sort，可以对List集合进行自然排序（从小到大）
 */
public class SortListDemo {
    public static void main(String[] args) {
        Random rand = new Random();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(100));
        }
        System.out.println(list);

        Collections.sort(list); //排序
        System.out.println(list);

//        Collections.shuffle(list);//乱序

        //使用比较器完成数组从大到小排序
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(list);


    }
}
