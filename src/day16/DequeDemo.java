package day16;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 双端队列
 * java.util.Deque接口，继承自Queue
 *  双端队列是两端都可以进出队的队列，常用实现类：LinkedList
 */
public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.offer("one");
        deque.offer("two");
        deque.offer("three");
        System.out.println(deque);

        deque.offerFirst("four");
        System.out.println(deque);
        deque.offerLast("five");//等效于offer
        System.out.println(deque);

        String str = deque.poll();
        System.out.println(str);
        System.out.println(deque);

        str = deque.pollFirst();//等效于poll
        System.out.println(str);
        System.out.println(deque);

        str = deque.pollLast();
        System.out.println(str);
        System.out.println(deque);



    }
}
