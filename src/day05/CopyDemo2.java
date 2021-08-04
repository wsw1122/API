package day05;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 由于机械硬盘读写效率差，频繁进行读写复制效率不高。
 * 我们可以通过提高每次读写的数据量，减少实际读写的次数从而提高读写效率。
 *
 * 单字节读写一般也称为:随机读写；  一组字节读写也称为：块读写
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src = new RandomAccessFile("music.mp3","r");
        RandomAccessFile desc = new RandomAccessFile("music_cp.mp3","rw");

        /*
            int read(byte[] data)
             连续读取给定字节数组宗长度的字节量，并将读取到的字节存入该数组中。
             返回值为实际读取到的字节量，我们应当根据实际读取的字节量判断该数组
             中本次读取数据的实际长度。

            void write(byte[] data)
             一次性将给定的字节数组中所有字节写出

            void write(byte[] data,int offset,int len)
             将给定的字节数组从下标offset处的连续len个字节一次性写出
         */
        long start =  System.currentTimeMillis();

        byte[] data = new byte[10*1024];
        int len = -1;//表示每次实际读取到的字节量
        while((len=src.read(data)) != -1){
            desc.write(data,0,len);
        }

        long end =  System.currentTimeMillis();
        System.out.println("耗时: "+(end-start)+"ms");

        src.close();
        desc.close();

    }
}
