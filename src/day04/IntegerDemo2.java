package day04;

/**
 * 包装类提供了一个静态方法:parseXXX(String str)
 *  可以将字符串解析为对应的基本数据类型，前提是这个字符串的内容正确描述了
 *  基本类型可以保存的值，否则就会抛异常。
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        String str = "123";
        int i = Integer.parseInt(str);//只能转为整数类型(小数/字母无法转换)
        System.out.println(i);

        double d = Double.parseDouble(str);
        System.out.println(d);


    }
}
