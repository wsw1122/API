package day05;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 文件复制
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src = new RandomAccessFile("music.mp3","r");

        RandomAccessFile desc = new RandomAccessFile("music_cp.mp3","rw");

        long start =  System.currentTimeMillis();
        int d = 0;
        //连续读取字节
        while ((d=src.read())!=-1){
            desc.write(d);//连续写出字节
        }
        long end =  System.currentTimeMillis();
        System.out.println("耗时: "+(end-start)+"ms");

        src.close();
        desc.close();


    }
}
