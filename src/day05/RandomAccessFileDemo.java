package day05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 *  专门用来读写文件数据的API，其基于指针读写，可以对文件任意位置进行读写操作。
 *  编辑文件数据内容非常灵活。
 */
public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException {
        /*
            创建一个对当前目录下的 test.dat 文件操作的RAF

            创建RAF时第一个参数为：指定要操作的文件
            第二个参数:模式(常用的两个选项)
             "r"  只读模式  -- 不会创建新文件，报错:文件找不到异常
             "rw" 读写模式  --  没有文件，会创建新文件
         */
//        File file = new File("./test.dat");
//        RandomAccessFile ran = new RandomAccessFile(file,"rw");

        RandomAccessFile raf = new RandomAccessFile("./test.dat","rw");
        //1G = 1024M(兆) ,1M=1024kB(千字节), 1KB=1024B(字节) , 1B=8Bit(位)
        /*
            void write(int d)
             向文件中写入1个字节，写入的是给定的int值所对应2进制的"低8位"。
                                      vvvvvvvv
           00000000 00000000 00000000 00000001
         */
        raf.write(1);

        //将所有小写字母写入文件
//        for (int i=0;i<26;i++){
//            raf.write(97+i);
//        }

        System.out.println("写出完毕!");
        raf.close();
    }
}
