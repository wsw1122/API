package day02;

/**
 * String toUpperCase()
 * String toLowerCase()
 *  将一个字符串中的英语转换为全大写或全小写
 */
public class ToUpperCaseDemo {
    public static void main(String[] args) {
        String str = "我爱Java";
        String upper = str.toUpperCase();
        System.out.println(upper);

        String lower = str.toLowerCase();
        System.out.println(lower);
    }
}
