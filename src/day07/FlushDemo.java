package day07;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲输出流的缓冲区问题
 */
public class FlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        String str = "夜空中最亮的星，能否想起。";

//        fos.write(str.getBytes()); //会正常写出
        bos.write(str.getBytes());

        /*
        flush方法是将缓冲区已经缓存的数据一次性写出
         频繁的调用会降低写出效率，但是可以改变写出数据的及时性
         */
//        bos.flush();

        System.out.println("写出完毕.");

        bos.close();

    }
}
