package day04;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Point p = new Point(1,2);
        /*
        Object提供了toString方法，意义是将改对象转换为一个字符串。
        Object已经实现了该方法，返回的字符串内容为改对象的句柄(类名@地址)。
         */
        //该方法就是将给定对象toString方法返回的字符串输出到控制台
//        System.out.println(p.toString());
        System.out.println(p);

        //字符串与引用类型变量连接时，也是先调用其toString方法再与字符串连接的
        String line = "p:" + p;
        System.out.println(line);

        Point[] arr = {new Point(3,4),new Point(5,6)};
        System.out.println(Arrays.toString(arr));

        /*
        Object提供了equals方法，定义为 boolean equals(Object obj)
         设计意图是比较当前对象与参数对象内容是否相同，但是Object实现这个方法
         时，内部用this==obj进行判定的，所以若不重写这个方法，没有实际意义。
         */
        Point p2 = new Point(1,2);
        System.out.println(p==p2);//false
        System.out.println(p.equals(p2));//true
        /*
        对于引用类型变量而言，由于保存的是地址，所以"=="做值比较时，
        比较的是两个变量指向的是否是"同一个对象"。
        equals方法比较的是两个对象的内容是否相同。
         */
    }
}
