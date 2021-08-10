package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;

/**
 * 向文件中写出字符串
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {

        RandomAccessFile raf = new RandomAccessFile("raf.txt","rw");
        String str = "回首，掏~";


        /*
        String提供了将字符串转换为字节的方法:
         byte[] getBytes()  按照系统默认字符集转换(不推荐)

         byte[] getBytes(String csn) 按照给定的字符集进行转换
           字符集名称(常用):
            utf-8:(万国码) 英文1字节，中文3字节
            gbk:(国标码) 英文1字节，中文2字节
         */
        byte[] data = str.getBytes("utf-8");
        raf.write(data);

//        str = "鬼刀一开看不见~";
//        raf.write(str.getBytes("utf-8"));

        System.out.println("写出完毕.");
        raf.close();






    }
}




