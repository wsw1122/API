package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成文件的复制操作
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        /* 步骤:
        1.创建文件输入流读取源文件
        2.创建文件输出流向复制文件写
        3.循环从源文件读取一组字节并写入到复制文件中完成复制操作
        4.关闭两个流
         */
        FileInputStream fis = new FileInputStream("tomcat.zip");
        FileOutputStream fos = new FileOutputStream("tomcat_cp.zip");

        byte[] data = new byte[1024*10];
        int len = -1;
        while ((len=fis.read(data)) != -1){
            fos.write(data,0,len);
        }
        System.out.println("复制完毕。");
        fis.close();
        fos.close();

    }
}













