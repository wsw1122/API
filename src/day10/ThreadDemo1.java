package day10;

/**
 * 多线程:允许我们并发执行多个代码片段
 * <p>
 * 创建线程有两种方式:方式一:
 * 定义一个类继承Thread并重写run方法。run方法用来定义需要线程并发执行的任务代码
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        //走完第一个，再走第二个
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("你是谁呀");
//        }
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("我是查水表的");
//        }
        Thread t1 = new MyThread1();
        Thread t2 = new MyThread2();
        /*
          注意，启动线程要调用start方法，而不是直接调用run方法
          start方法调用完毕后，线程纳入线程调度器，当该线程第一次获得CPU时间开始运行时，
          其run方法会自动被调用。
          线程纳入线程调度器后，只能被动的等待分配CPU的时间片，得到时间片后，
          CPU便会运行该线程的任务代码，时间片用完后，CPU离开，此时线程调度会再
          分配时间片给某个线程使其运行。

          线程调度器分配时间片的概率是一样的，但所有并发运行的线程不保证"一人一次"这样
          均匀的分配时间片。
         */
        t1.start();
        t2.start();
    }
}
/*
第一种方式创建线程的优缺点:
1.优点：创建简单，执行任务更直接

2.缺点：
    2.1.java单继承，这会导致我们继承了线程类之后不能继承其他类复用方法。不方便
    2.2.定义线程的同时重写run方法，将任务一同定义出来。任务和线程属于必然耦合，不利于线程重用
 */
class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("你是谁呀");
        }
    }
}
class  MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("我是查水表的");
        }
    }
}







