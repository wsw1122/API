package day15;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序自定义类型元素
 */
public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(1,2));
        list.add(new Point(3,5));
        list.add(new Point(6,8));
        list.add(new Point(9,9));
        list.add(new Point(4,2));
        System.out.println(list);

        /*
        sort方法要求集合元素必须实现Comparable接口，Java常用类如：包装类，String等他们
        都实现了这个接口，定义了元素之间大小规则。

        但是我们对于自定义类型的元素，不建议实现这个接口，因为这样的操作对我们代码有侵入性。
        不利于代码的维护
         */
//        Collections.sort(list);
        /*
        重载的sort方法要求在传入一个参数，是Comparator接口的实现类。

        该接口是用来单独定义一个比较器，为集合元素指定比较大小的规则。

        这样一来，该sort方法会将集合元素利用该比较器的比较规则两两比较，
        并按照从小到大的顺序将集合排序。
         */
        Collections.sort(list, new Comparator<Point>() {
            /*
            compare方法用来定义参数o1,o2的比较大小的规则：
                o1-o2   升序      o2-o1   降序
             */
            public int compare(Point o1, Point o2) {
                int len1 = o1.getX()*o1.getX() + o1.getY()*o1.getY();
                int len2 = o2.getX()*o2.getX() + o2.getY()*o2.getY();
                return len1-len2;
            }
        });
        System.out.println(list);
    }
}
