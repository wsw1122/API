package day01;

/**
 * int indexOf(String str) 
 *  查找给定字符串在当前字符串中位置, 若返回值为-1，则表示当前字符串中不含有给定的内容
 */
public class IndexOfDemo {
    public static void main(String[] args) {
        //             0123456789012345
        String line = "thinking in java";
        //从开始检索第一次出现给定字符的位置
        int index = line.indexOf("in");
        System.out.println("index:"+index);//2

        //从指定位置开始检索 第一次出现给定字符串的位置
        index = line.indexOf("in",3);
        System.out.println("index:"+index);//5

        //查找最后一次出现 给定字符 的位置
        index = line.lastIndexOf("in");
        System.out.println("index:"+index);//9
    }
}










