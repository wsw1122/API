package day02;

/**
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 *  判断当前字符串是否是以给定字符串开始或结尾的
 */
public class StartsWithDemo {
    public static void main(String[] args) {

        String str = "thinking in java";

        boolean starts = str.startsWith("thi");
        System.out.println(starts);

        boolean ends = str.endsWith("ava");
        System.out.println(ends);



    }
}
