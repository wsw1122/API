package day16;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈结构（经典数据结构）
 *  可以保存一组数据，但是存取必须遵循“先进后出”原则
 *  通常使用栈完成“后退”操作
 */
public class StackDemo {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        System.out.println(stack);

        String str = stack.pop();
        System.out.println(str);
        System.out.println(stack);

        //遍历操作
        for (String s : stack) {
            System.out.println(s);
        }
        System.out.println(stack);

        //用pop方法遍历栈
        while(stack.size()>0){
            str = stack.pop();
            System.out.println(str);
        }
        System.out.println(stack);
    }
}
