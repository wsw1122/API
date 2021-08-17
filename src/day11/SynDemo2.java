package day11;


/**
 * 同步块
 *  synchronized(同步监视器对象){
 *      需要同步运行的代码片段
 *  }
 *  同步代码块可以更准确的控制需要同步运行的代码片段，有效的缩小
 *  同步范围可以保证并发安全的前提下尽可能的提高并发效率。
 */
public class SynDemo2 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Shop shop1 = new Shop();
        Thread t1 = new Thread(){
            public void run() {
                shop.buy();
            }
        };
        Thread t2 = new Thread(){
            public void run() {
                shop1.buy();
            }
        };
        t1.start();
        t2.start();
    }
}
class Shop{
    public void buy(){
        Thread t = Thread.currentThread();
        try {
            System.out.println(t.getName()+"正在挑衣服...");
            Thread.sleep(5000);
            /*
            同步块要求指定一个同步监视器对象，即：上锁的对象。
            这个对象可以使java中任何对象，但是必须保证多个需要同步运行代码片段的线程看到的该对象是"同一个"。
             */
            synchronized ("abc"){
                System.out.println(t.getName()+"正在试衣服...");
                Thread.sleep(5000);
            }

            System.out.println(t.getName()+"正在结账离开!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}