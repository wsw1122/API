package day08;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK7之后推出的特性:自动关闭
 */
public class AutoCloseDemo {
    public static void main(String[] args) {
        /*
        JDK7之后的这个特性允许我们将需要关闭的内容定义在try后面"()"当中，但是需要注意:
        只有实现AutoCloseable接口的类可以在这里定义，剩下的还是应当在try语句块中定义，
        否则会出现编译不通过现象。
        该特性是编译器认可，当编译成class文件后，还是在finally中将流关闭的。
         */
        try(
                FileOutputStream fos = new FileOutputStream("fos.txt");
                ){
            fos.write(1);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
