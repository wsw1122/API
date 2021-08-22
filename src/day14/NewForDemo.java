package day14;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;

/**
 * JDK5之后推出的特性:增强for循环(新循环)
 *  新循环不是用来取代传统for循环的操作,仅用来遍历集合或数组使用
 */
public class NewForDemo {
    public static void main(String[] args) {
        
        String[] array = {"one","two","three","four"};

        for (int i = 0; i < array.length; i++) {
            String str = array[i];
            System.out.println(str);
        }

        for(String str : array){
            System.out.println(str);
        }

        Collection c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        System.out.println(c);
        //编译器会将新循环遍历集合改为迭代器遍历,所以在遍历的过程中不能通过集合的方法增删元素
        for (Object str : c ) {
            System.out.println((String)str);
        }

    }
}
