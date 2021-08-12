package day08;

/**
 * 异常处理机制: try-catch
 * 语法：
 *  try{
 *      代码片段
 *  }catch(XXXException e){
 *      解决try代码片段中出现XXXException的处理代码
 *  }
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始啦.");

        try{
//            String str = null;
//            System.out.println(str.length());
//            String str = "";
//            System.out.println(str.charAt(0));
            String str = "a";
            System.out.println(Integer.parseInt(str));
            /*
            try语句中如果某句代码抛出了异常，那么try语句块中该句代码后面的内容都不会被运行
             */
            System.out.println("!!!");
        }catch (NullPointerException e){
            System.out.println("出现了空指针!");
        /*
          catch可以定义多个，针对不同异常有不同处理方式，我们可以分别捕获这些异常并进行处理
         */
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("字符串下标越界!");
        /*
        可以在最后一个catch捕获Exception，避免因为一个未捕获的异常导致程序中断。
        */
        }catch (Exception e){
            System.out.println("程序出错了，请联系客服进行处理!");
        }

        System.out.println("程序结束啦!");
    }
}









