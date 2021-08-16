package day08;

/**
 * 自定义异常
 *  自定义异常通常是用来定义我们程序中一些业务逻辑错误
 *  比如:年龄不合法异常
 *
 * 自定义异常需要：
 *  1.定义异常的类名(见名知意):应当做到通过该异常的类名能大致判断出因为什么原因引起的
 *  2.需要继承Exception，至少是它的子类
 *  3.提供序列化版本号
 *  4.提供所有的构造方法（与Exception定义的构造方法一样）
 */
public class IllegalAgeException extends Exception{

   private static final long serialVersionUID = 1L;

    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }

    public IllegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAgeException(Throwable cause) {
        super(cause);
    }

    public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
