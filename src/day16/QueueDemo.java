package day16;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列(经典数据结构之一)
 *  可以保存一组数据，但是存取元素必须遵循“先进先出”。
 *
 * java.util.Queue接口
 *  Queue继承自Collection，队列定义了存取元素的相关方法。
 *  常用实现类：java.util.LinkedList
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        //入队操作: 将元素添加到队列末尾
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        queue.offer("four");
        System.out.println(queue);

        //出队操作: 获取并删除队列中队首元素
        String str = queue.poll();
        System.out.println(str);
        System.out.println(queue);

        //引用队首元素: 获取队首元素，但是不做删除操作
        str = queue.peek();
        System.out.println(str);
        System.out.println(queue);

        /*
        遍历队列: 使用迭代器遍历后，元素还是在队列当中的
         */
        for (String s : queue) {
            System.out.println(s);
        }
        System.out.println(queue);
    }
}





