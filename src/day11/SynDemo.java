package day11;

import java.beans.beancontext.BeanContext;

/**
 * 多线程并发安全问题
 *  当多个线程操作同一个资源(临界资源)时，由于线程切换时机不确定，导致执行
 *  此操作的顺序混乱，会出现执行过程与结果不相符的情况。严重会导致系统崩溃。
 */
public class SynDemo {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new Thread(){
            public void run() {
                while(true){
                    int bean = table.getBeans();
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };
        Thread t2 = new Thread(){
            public void run() {
                while(true){
                    int bean = table.getBeans();
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };
        t1.start();
        t2.start();
    }
}
class Table{
    private int beans = 20;//桌子有20颗豆子
    /*
        当一个方法使用关键字 synchronized 修饰后，这个方法就是“同步方法”。
         即：多个线程不能同时进入到方法内部执行。

        将多个线程并发执行操作临界资源改为同步执行就可以有效的解决多线程的并发安全问题。
     */
    public synchronized int getBeans(){
        if(beans == 0){
            throw new RuntimeException("桌子没有豆子了！");
        }
        Thread.yield();//模拟CPU时间片用完导致线程切换
        return beans--;
    }
}

