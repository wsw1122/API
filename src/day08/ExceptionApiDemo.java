package day08;

/**
 * 异常的常用方法
 */
public class ExceptionApiDemo {
    public static void main(String[] args) {
        System.out.println("程序开始啦.");
        System.err.println("测试开始啦.");
        try{
            String str = "a";
            System.out.println(Integer.parseInt(str));
        }catch (Exception e){
            /*
            System.out 向控制台输出内容
            System.err 向控制台输出内容，实际上在两个线程上进行的并发输出。
             所以使用这个输出时，控制台会出现"串行"的情况。

             printStackTrace()使用的是System.err向控制台输出的错误信息
             */
            //1.输出错误堆栈信息，有助于定位并解决错误
            e.printStackTrace();
            //2.获取错误信息
            String str = e.getMessage();
            System.out.println(str);
        }
        System.out.println("程序结束啦!");
    }
}
