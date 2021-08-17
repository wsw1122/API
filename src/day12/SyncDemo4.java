package day12;

/**
 * 互斥锁
 *
 * 当使用Synchronized锁定多个代码片段，并且指定的同步监视器对象是
 * 同一个时，这些代码片段就是互斥的，多个线程不能同时执行它们。
 */
public class SyncDemo4 {
    public static void main(String[] args) {
        Foo foo = new Foo();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                foo.methodA();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                foo.methodB();
            }
        };
        t1.start();
        t2.start();
    }
}

class Foo{
    public synchronized void methodA(){
        try{
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+":正在执行A方法。。。");
            Thread.sleep(5000);
            System.out.println(t.getName()+":执行A方法完毕！");
        }catch (Exception e){
        }
    }
    public synchronized void methodB(){
        try{
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+":正在执行B方法。。。");
            Thread.sleep(5000);
            System.out.println(t.getName()+":执行B方法完毕！");
        }catch (Exception e){
        }
    }
}
