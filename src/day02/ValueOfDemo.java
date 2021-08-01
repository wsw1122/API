package day02;

/**
 * static String valueOf()
 *  字符串提供了很多个重载的valueOf方法，作用是将给定的内容转换为字符串。
 *   常用的基本类型转换为字符串
 *
 */
public class ValueOfDemo {
    public static void main(String[] args) {
        int a = 1;
/*      String str = a + "";
        System.out.println(str);*/
        String str = String.valueOf(a);
        System.out.println(str);

        double d = 1.1;
        str = String.valueOf(d);
        System.out.println(str);

    }
}
