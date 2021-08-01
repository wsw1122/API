package day04;

/**
 * JDK5推出的特性:自动拆装箱(编译器认可，而非虚拟机认可)
 *  编译器在编译代码时如果发现需要在基本数据类型和对应的包装类型之间赋值。
 *  则编译器会自动补齐代码在他们之间进行转换。
 */
public class IntegerDemo3 {
    public static void main(String[] args) {

        int d = 123;
        /*
        触发自动装箱特性，编译器会补全代码将基本数据类型转换为包装类型
        Integer in = Integer.valueOf(d);
         */
        Integer in = d;
        /*
        触发自动拆箱特性，编译器会补齐代码，将包装类型转换为对应基本数据类型
        d = new Integer(121).intValue();
         */
        d = new Integer(121);

    }
}
