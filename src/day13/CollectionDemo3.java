package day13;

import day04.Point;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * 集合中保存的元素是该元素的引用 例证
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        Point p=new Point(1,2);
        c.add(p);
        //输出内容查看是否相同
        System.out.println("p = " + p);
        System.out.println("c = " + c);
        //将p对象的属性修改
        //查看c对象中元素的属性值
        p.setX(10);
        System.out.println("p = " + p);
        System.out.println("c = " + c);

    }
}
