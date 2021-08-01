package day03;

/**
 * 字符串支持正则表达式三:
 *  String replaceAll(String regex,String str)
 *   将当前字符串中满足正则表达式的部分替换为给定的内容
 */
public class ReplaceAllDemo {
    public static void main(String[] args) {

        String str = "abc123def456ghi";
        //将当前字符串中的数字部分替换为:"#NUMBER#"
        String  s = str.replaceAll("[0-9]+","#NUMBER#");
        System.out.println(s);

    }
}










