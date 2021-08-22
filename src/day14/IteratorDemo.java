package day14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 遍历集合元素
 *  Collection提供了统一的遍历集合元素的操作:迭代器模式
 *
 *  Iterator iterator()
 *   该方法会返回一个用于遍历该集合的迭代器,使用这个迭代器便可以遍历当前集合元素
 *
 *  java.util.Iterator接口
 *   他是所有迭代器的顶级接口,不同集合都实现了一个用于遍历自身元素的迭代器实现类
 *
 *  迭代器遍历集合遵循的原则为: 问 取 [删](删不是必要操作);
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        System.out.println(c);

        //获取迭代器
        Iterator it = c.iterator();
        /*
        boolean hasNext()
         判断集合是否还有下一个元素可以迭代
        E next()
         获取集合下一个元素
         */
        while(it.hasNext()){
            String str = (String)it.next();
            System.out.println(str);
            if("#".equals(str)){
                /*
                迭代器要求在遍历的过程中不得使用集合的方法增删元素,否则遍历是会抛出异常:
                并发修改异常: ConcurrentModificationException

                迭代器也提供了remove方法,删除的是通过next方法取出的元素
                 */
//                c.remove(str);
                it.remove();
            }
        }

        System.out.println(c);
    }
}
















