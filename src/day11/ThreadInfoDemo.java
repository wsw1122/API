package day11;

/**
 * 线程常见API
 */
public class ThreadInfoDemo {
    public static void main(String[] args) {
        //获取主线程
        Thread main = Thread.currentThread();
        //获取线程的唯一标识
        long id = main.getId();
        System.out.println(id);
        //获取线程名字
        String name = main.getName();
        System.out.println(name);
        //获取线程的优先级
        int priority = main.getPriority();
        System.out.println(priority);
        //线程是否处于活动状态
        boolean isAlive = main.isAlive();
        //线程是否为守护线程
        boolean isDaemon = main.isDaemon();
        //线程是否被中断
        boolean isInterrupted = main.isInterrupted();
        System.out.println("是否活着:"+isAlive);
        System.out.println("是否为守护:"+isDaemon);
        System.out.println("是否中断:"+isInterrupted);



    }
}
