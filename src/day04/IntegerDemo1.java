package day04;

/**
 * 包装类
 * 包装类是为了解决基本数据类型不能直接参与面向对象开发的问题
 *  使得基本数据类型可以以对象的形式保存
 */
public class IntegerDemo1 {
    public static void main(String[] args) {
        int i = 127;
        Integer i1 = new Integer(i);
        Integer i2 = new Integer(i);
        System.out.println(i1==i2);//false
        System.out.println(i1.equals(i2));//true

        //建议使用valueOf将基本数据类型转换为包装类
        Integer i3 = Integer.valueOf(i);//会重用对象(范围:-128~127)
        Integer i4 = Integer.valueOf(i);
        System.out.println(i3==i4);       //true
        System.out.println(i3.equals(i4));//true

        Double d1 = Double.valueOf(1.1); //不会重用对象
        Double d2 = Double.valueOf(1.1);
        System.out.println(d1==d2);        //false
        System.out.println(d1.equals(d2)); //true

        //从包装类转换为基本数据类型
        double dou = d1.doubleValue();
        System.out.println(dou);

        int in = i1.intValue();
        System.out.println(in);

        /*
        取值范围:
         数字类型的包装类有两个常量：
          MAX_VALUE,MIN_VALUE
         用于表示其对应的基本类型的取值范围
         */
        int imax = Integer.MAX_VALUE;
        System.out.println(imax);
        int imin = Integer.MIN_VALUE;
        System.out.println(imin);

        long lmax = Long.MAX_VALUE;
        System.out.println(lmax);



    }
}
