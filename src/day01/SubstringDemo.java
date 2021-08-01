package day01;

/**
 * String substring(int start,int end)
 *  截取当前字符串中指定范围内的字符串
 *
 *  Java API (特点)：通常两个数字表示范围时，都是"含头不含尾"的
 */
public class SubstringDemo {
    public static void main(String[] args) {
        //             01234567890
        String line = "www.tedu.cn";

        String sub = line.substring(4,8);
        System.out.println(sub);//tedu

        //重载方法可以从指定位置截取到字符串末尾
        sub = line.substring(4);
        System.out.println(sub);//tedu.cn

        String address = getHostName("www.baidu.com");
        System.out.println(address); //baidu

        address = getHostName("http://www.tedu.cn");
        System.out.println(address); //tedu

        address = getHostName("www.tmooc.com.cn");
        System.out.println(address); //tmooc
    }

    public static String getHostName(String str){
        //练习:完成方法，获取给定地址(str)中域名
        int start = str.indexOf(".")+1;//+1修正截取起点
        int end = str.indexOf(".",start);//留前不留后
        return str.substring(start,end);
    }


}
