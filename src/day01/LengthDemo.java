package day01;

/**
 * int length()
 *  返回当前字符串的字符个数(实际上就是char数组的长度)
 */
public class LengthDemo {
    public static void main(String[] args) {
        String str = "我爱Java!";
        int len = str.length();
        System.out.println("长度:"+len);
    }
}
