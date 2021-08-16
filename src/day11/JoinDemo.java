package day11;


/**
 * 线程提供了一个方法：void join()
 *  该方法允许执行这个方法的线程在该方法所属线程后等待，知道该方法所属线程
 *  结束后方可继续运行，否则会一直处于阻塞状态。
 *
 *  所以join可以协调线程之间的同步运行
 *
 *  同步运行：执行有先后顺序
 *  异步运行：执行没有先后顺序(多线程就是异步)
 */
public class JoinDemo {
    //做标记：标识图片下载完毕
    private static boolean isFinish = false;

    public static void main(String[] args) {
        /*
        JDK8之前有一个强制要求（JDK8不强制要求，但是若使用不当，编译器仍会编译错误）

        当一个方法的局部内部类中引用了这个方法的其他局部变量时，要求这个变量必须声明为final的。
        (源于JVM内存分配的问题)
         */
        //下载图片的线程
        final Thread download = new Thread(){
            public void run() {
                System.out.println("down:开始下载图片...");
                for (int i = 0; i <= 100 ; i++) {
                    System.out.println("down:"+i+"%");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("down:下载成功!");
                isFinish = true;
            }
        };
        Thread show = new Thread(){
            public void run() {
                try {
                    System.out.println("show:开始显示文字...");
                    Thread.sleep(1000);
                    System.out.println("show:显示文字完毕!!!");

                    System.out.println("show:等待download下载图片...");
                    download.join();
                    System.out.println("show:download下载图片完毕!!!");
                    if (!isFinish){
                        throw new RuntimeException("图片加载失败");
                    }
                    System.out.println("show:显示图片完毕!!!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        download.start();
        show.start();
    }
}











