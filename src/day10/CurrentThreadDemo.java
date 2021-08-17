package day10;

/**
 * 线程提供了一个静态方法：
 * static Thread currentThread()
 *  将运行这个方法的线程返回
 */
public class CurrentThreadDemo {
    /*
        main方法实际上也是靠一个线程运行的
     */
    public static void main(String[] args) {
        //获取到运行main方法的线程
        Thread main = Thread.currentThread();
        System.out.println("运行main方法的线程是:"+main);
        //      线程名字,线程优先级,线程组
        //Thread[main,5,main]

        dosome();//Thread[main,5,main]

        Thread t = new Thread(){
            public void run() {
                Thread t = Thread.currentThread();
                System.out.println("自定义线程:"+t);
                dosome();//Thread[Thread-0,5,main]
            }
        };
        t.start();
    }

    public static void dosome(){
        Thread t = Thread.currentThread();
        System.out.println("运行dosome方法的线程:"+t);
    }


}
