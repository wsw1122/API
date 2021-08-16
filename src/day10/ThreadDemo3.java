package day10;

/**
 * 使用匿名内部类完成两种线程的创建方式
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        //方式一
        Thread t1 = new Thread(){
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("你是谁呀");
                }
            }
        };

        //方式二
        Runnable r1 = new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("我是查水表的");
                }
            }
        };
        Thread t2 = new Thread(r1);

        t1.start();
        t2.start();

    }
}
