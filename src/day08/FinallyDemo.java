package day08;

/**
 * finally块是异常处理机制的最后一块，可以直接跟在try后面或者最后一个catch之后。
 *
 * finally可以保证只要代码执行到try当中，无论try语句块中的代码是否抛出异常，
 * finally块中的内容必定执行。
 *
 * 所以我们通常释放资源这类操作放在这里确保执行
 */
public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了.");
        try{
//            String str = null;
            String str = "";
            System.out.println(str.length());
            return;//不报错，结束方法，finally内容会走，正常代码不会走
        }catch (Exception e){
            System.out.println("出错了!");
        }finally {
            System.out.println("finally块执行了!!");
        }

        System.out.println("程序结束啦!");
    }
}








