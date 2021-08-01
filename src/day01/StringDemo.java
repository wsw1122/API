package day01;
/**
 特殊的字符串:
  1.String类是有final修饰
  2.String有特殊的赋值方式
  3.String本质为char数组
  4.String是不可变对象
  5.String使用Unicode编码保存
 */
public class StringDemo {

    public static void main(String[] args) {

        String s1 = "123Hello";//堆中常量池创建新对象
        String s2 = "123Hello";//常量池中有该对象，地址直接指向常量池对象
        System.out.println(s1==s2); //true

        String s3 = "123Hello";
        System.out.println(s1==s3); //true

        s1 = s1+ "!"; //修改内容会创建新对象
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println(s2==s3);//true
        System.out.println(s1==s3);//false

        //new创建的字符串对象并不会重用(不推荐)
        String s4 = new String("123Hello");
        System.out.println(s4);
        /*
         == 比较地址是否相同
         equals比较内容是否相同
         */
        System.out.println(s2==s4);//false
        System.out.println(s2.equals(s4));//true

        String s5 = new String("123abc");
        System.out.println(s4==s5); //false
        System.out.println(s4.equals(s5));//false

        /*
        编译器有个特性，凡事能在编译器确定的计算结果，一定会在编译期运行计算
        将编译的结果直接保存编译成class文件，不会每次运行时在计算，以提高运行效率。
         */
        System.out.println("---------");
        s2 = "123abc";
        String s6 = "123"+"abc";
        //编译时：s6 = "123abc";
        System.out.println(s6);
        System.out.println(s6==s2);//true

        String ss = "123";
        String s7 = ss + "abc";
        System.out.println(s7);
        System.out.println(s6==s7);//false
        System.out.println(s6.equals(s7));

               //'0'-48  'a'-97 'A'--65
        String s8 = '1'+23+"abc";
        System.out.println(s8);//72abc

        System.out.println('2'+'2');//100
        System.out.println('2'+2);//52
        System.out.println("2"+2);//22

    }

}







