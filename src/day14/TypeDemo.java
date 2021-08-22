package day14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * JDK5版本推出特性:泛型
 *  泛型(参数化类型),允许我们使用一个类时指定其属性 方法参数 以及返回值的类型.
 *  使得代码的灵活度提高.
 *
 * 泛型应用最广的地方就是集合,用来约束集合的元素类型.
 */
public class TypeDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        System.out.println(c);

        for (String str : c) {
            System.out.println(str);
        }
        //迭代器可以指定泛型类型,与遍历的集合泛型保持一致
        Iterator<String> it = c.iterator();
        while(it.hasNext()){
            String str= it.next();
            System.out.println(str);
        }

    }
}
