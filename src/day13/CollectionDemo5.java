package day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合对集合的操作
 */
public class CollectionDemo5 {
    //一个集合对象(ArrayList)还可以对另一个集合对象进行整体操作
    //比如对原有集合批量的新增新集合的元素,或是删除它们

    public static void main(String[] args) {
        Collection c1 =new ArrayList();
        c1.add("red");
        c1.add("blue");
        c1.add("cyan");

        Collection c2 =new ArrayList();
        c1.add("red");
        c1.add("yellow");
        c1.add("pink");

        /**
         *  批量新增的方法
         *  boolean addAll(Collection c)
         *  返回值表示新增是否完成
         *  参数是另一个集合
         *  当前集合会新增参数集合中的所有元素
         *  但是如果集合类型是Set,不会新增重复的元素
         */
        c1.addAll(c2);
        System.out.println("c1 = " + c1);
        //c2.add("black");
        /**
         * 判断当前集合是否包含另一个集合的全部元素
         * boolean containsAll(Collection c)
         */
        boolean contains=c1.containsAll(c2);
        System.out.println(contains);

        Collection c3=new ArrayList();
        c3.add("red");
        c3.add("yellow");
        c3.add("white");
        /**
         * 删除当前集合中所有匹配指定集合的元素
         * boolean removeAll(Collection c)
         */
        //因为我们c1新增了c2的元素引用,所以不能删除它
        // 新定义的c3和c1没有关系,可以执行删除
        boolean remove=c1.removeAll(c3);
        System.out.println("remove = " + remove);
        System.out.println("c1 = " + c1);

    }

}
