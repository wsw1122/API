package day02;

/**
 *  字符串不便对象特性只针对字符串重用，并没有考虑修改操作的性能，
 *  因此String不适合频繁修改内容。
 *
 *  若有频繁修改的操作，使用StringBuilder来完成，它是专门设计出来，
 *  为了修改字符串内容的，其提供了对字符串内容的编辑操作所对应的：增、删、改、插。
 *
 *  StringBuffer (1.1): 线程安全，同步处理，性能慢
 *  StringBuilder (1.5): 线程不安全，并发处理，性能快
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        String line = "好好学习Java";
        //默认表示空字符串
//      StringBuilder builder = new StringBuilder();

        //基于规定字符串修改
        StringBuilder builder = new StringBuilder(line);
        //StringBuffer builder = new StringBuffer(line);
        /*
        追加内容:好好学习Java,为了找个好工作!
         */
        builder.append(",为了找个好工作!");
        System.out.println(builder);

        /*
                0 1 2 3456789 01 2 3 456
                好好学习Java,为了找个好工作!
        修改内容:好好学习Java,就是为了改变世界!
         */
        builder.replace(9,16,"就是为了改变世界");
        System.out.println(builder);

        /*
                好好学习Java,就是为了改变世界!
        删除内容:,就是为了改变世界!
         */
        builder.delete(0,8);
        System.out.println(builder);

        /*
                ,就是为了改变世界!
        插入内容:活着,就是为了改变世界!
         */
        builder.insert(0,"活着");
        System.out.println(builder);
    }
}
