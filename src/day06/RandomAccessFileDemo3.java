package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAF读写基本类型数据，以及基于指针的操作
 */
public class RandomAccessFileDemo3 {
    public static void main(String[] args) throws IOException {

        RandomAccessFile raf =  new RandomAccessFile("raf.dat","rw");
        //获取指针的位置
        long pos = raf.getFilePointer();
        System.out.println("pos:"+pos);//0

        /*
                                       VVVVVVVV
            01111111 11111111 11111111 11111111

            >>> 24 位运算 将2进制向右移动指定位数
            max>>>24:00000000 00000000 00000000 01111111 11111111 11111111 11111111
            max>>>16:00000000 00000000 01111111 11111111 11111111 11111111
            max>>>8: 00000000 01111111 11111111 11111111 11111111
            max>>>0: 01111111 11111111 11111111 11111111
         */
        int max = Integer.MAX_VALUE;
        raf.write(max>>>24);
        System.out.println("pos:"+raf.getFilePointer());//1
        raf.write(max>>>16);
        raf.write(max>>>8);
        raf.write(max>>>0);
        System.out.println("pos:"+raf.getFilePointer());//4

        /*
        void writeInt(int num)
         该方法会连续写出4字节，将给定的int值写出
         */
        raf.writeInt(max);
        System.out.println("pos:"+raf.getFilePointer());//8

        raf.writeLong(123L);
        System.out.println("pos:"+raf.getFilePointer());//16

        raf.writeDouble(123.123);
        System.out.println("pos:"+raf.getFilePointer());//24

        /*
        void seek(long pos) 将指针移动到指定的位置
         */
        raf.seek(0);
        System.out.println("pos:"+raf.getFilePointer());//0
        /*
        int readInt()   连续读取4字节并还原对应的int值
         如果在读取过程中到了文件末尾，则该方法会抛出异常：EOFException--end of file
         */
        int i = raf.readInt();
        System.out.println(i);//2147483647
        System.out.println("pos:"+raf.getFilePointer());//4

        raf.seek(8);
        long l = raf.readLong();
        System.out.println(l);//123
        System.out.println("pos:"+raf.getFilePointer());//16

        double dou = raf.readDouble();
        System.out.println(dou);//123.123
        System.out.println("pos:"+raf.getFilePointer());//24

        //修改long值为 456
        raf.seek(8);
        /*
        重新写8字节，覆盖原内容即可
         */
        raf.writeLong(456L);

        raf.seek(8);
        l = raf.readLong();
        System.out.println(l);//456

        System.out.println("写出完毕.");
        raf.close();




    }
}
