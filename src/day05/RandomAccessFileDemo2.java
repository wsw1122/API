package day05;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 从文件中读取字节
 */
public class RandomAccessFileDemo2 {
    public static void main(String[] args) throws IOException {

        RandomAccessFile raf = new RandomAccessFile("test.dat","r");
        /*
        int read()
         从文件中读取1个字节，并以int形式返回。
         若返回值为-1，则表示已经读取到了文件末尾。
                                    vvvvvvvv
         00000000 00000000 00000000 00000001
         */
        int d = raf.read();
        System.out.println(d);
        //若返回值为-1，则表示已经读取到了文件末尾。
        d = raf.read();
        System.out.println(d);

        raf.close();

    }
}





