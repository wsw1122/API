package day11;

/**
 * 守护线程
 *  守护线程又称：后台线程，默认创建出来的线程都是普通线程。
 *  守护线程需要通过线程方法:setDaemon(boolean on)进行设置
 *
 *  守护线程和普通线程区别:(使用没有区别，结束时机不同)
 *   进程结束时，所有正在运行的守护线程都会被强制停止。
 *   进程结束:当一个进程中所有的普通线程结束时进程结束
 *
 *  GC就是跑在守护线程上的
 *   我们也可以将某些会一直运行的任务，并且当主要业务执行完毕后可以跟着一同结束的。
 *   就都可以放在守护线程上运行。
 */
public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread(){
            public void run() {
                System.out.println("rose:"+Thread.currentThread());
                for (int i = 0; i < 5; i++) {
                    System.out.println("rose: let me go!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("rose:啊啊啊啊...噗通....");
            }
        };
        Thread jack = new Thread(){
            public void run() {
                System.out.println("jack:"+Thread.currentThread());
                while(true){
                    System.out.println("jack:you jump!i jump!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        rose.start();
        //设置为守护线程(线程启动后进行设置)
        jack.setDaemon(true);
        jack.start();

//        while(true){
//
//        }
    }
}













