package day02;

/**
 * 频繁修改字符串带来的性能开销
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String str = "a";
        for (int i=0;i<1000000;i++){
            str += "a";
//          str = str + str;
        }
        System.out.println("执行完毕");
    }
}
