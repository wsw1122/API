package day12;

/**
 * 静态线程同步
 * 静态方法上如果使用synchronized时候，那么该方法一定具有同步效果
 * 静态方法上使用的同步监视器对象为当前类的类对象，即Class的一个实例
 * Java中每个被JVM加载的类都有且只有唯一一个类对象与之对应，因此静态方法
 * 锁该对象就一定具有同步效果。
 */
public class SyncDemo3 {
    public static void main(String[] args){
        Thread t1 = new Thread(){
            @Override
            public void run() {
                Boo.dosome();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                Boo.dosome();
            }
        };
        t1.start();
        t2.start();
    }
}

class Boo{
    public static void dosome(){
        /**
         * 静态方法中吗没有this关键字，所以如果想使用同步块，需要锁上当前类对象
         */
        synchronized (Boo.class){
            try{
                Thread t = Thread.currentThread();
                System.out.println(t.getName()+"：正在执行dosome方法。。");
                Thread.sleep(5000);
                System.out.println(t.getName()+":执行dosome方法完毕！");
            }catch (Exception e){

            }
        }
    }
}
