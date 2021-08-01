package day03;

/**
 * 字符串支持正则表达式方法一:
 *  boolean matches(String regex)
 *   使用给定的正则表达式判断当前字符串满足格式要求，满足返回true。
 *
 *  注：该方法是完全匹配验证的，无论是否添加正则表达式的
 *  边界匹配符:"^....$"都是做全匹配验证。
 */
public class MatchesDemo {
    public static void main(String[] args) {
        String email = "Lids123@tedu.com.cn";

        //String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        String regex = "\\w+@\\w+(\\.\\w+)+";
        boolean b = email.matches(regex);
        if(b){
            System.out.println("是邮箱");
        }else{
            System.out.println("不是邮箱");
        }

        //验证手机号(简易): 1 3/5/7/8 9位任意数字
        String r = "1[3578]\\d{9}";


    }
}
