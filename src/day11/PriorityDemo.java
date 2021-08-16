package day11;

/**
 * 线程优先级
 * 线程纳入线程调度后，时刻处于被动获取CPU时间片而非主动获取。
 * 我们可以通过提调整线程优先级来最大程度干涉线程调度分配时间片的几率
 *
 * 理论上优先级越高的线程获取CPU时间片的次数越多。
 *
 * 线程优先级有10个等级 用整数1-10表示，1为最低优先级 10为最高优先级 5为默认
 *
 * 调用setPriority()来设置优先级
 */
public class PriorityDemo {
    public static void main(String[] args) {
        Thread max = new Thread(){
            public void run() {
                for (int i=0;i<10000;i++){
                    System.out.println("max");
                }
            }
        };
        Thread min = new Thread(){
            public void run() {
                for (int i=0;i<10000;i++){
                    System.out.println("min");
                }
            }
        };
        Thread norm = new Thread(){
            public void run() {
                for (int i=0;i<10000;i++){
                    System.out.println("norm");
                }
            }
        };
        max.setPriority(Thread.MAX_PRIORITY);
        min.setPriority(Thread.MIN_PRIORITY);

        min.start();
        norm.start();
        max.start();
    }
}
