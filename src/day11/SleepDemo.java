package day11;

import java.util.Scanner;

/**
 * 线程提供的方法
 * static void sleep(long ms)
 *  静态方法，当一个线程执行了这个方法后就会进入阻塞状态，并阻塞指定的毫秒。
 *  当超时后，线程会自动回到RUNNABLE状态等待再次获取时间片并发运行
 */
public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了.");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {//中断异常
            e.printStackTrace();
        }

        /*
        练习：定时器(倒计时)
         程序启动后，要求输入一个数字，然后从这个数字开始每秒递减。
         当到0时，输出"时间到"，并退出程序。
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个数:");
        int num = Integer.parseInt(scan.nextLine());
        for ( ;num>0;num--){
            System.out.println(num);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("时间到");
        System.out.println("程序结束了!");
    }
}













