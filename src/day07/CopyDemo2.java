package day07;

import java.io.*;

/**
 * 使用缓冲流完成文件复制
 *  缓冲流：（高级流）
 *   java.io.BufferedInputStream
 *   java.io.BufferedOutputStream
 *  将他们连接上以后可以提高读写效率，这样一来无论是进行单字节读写还是块读写，
 *  都可以保证读写效率
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("tomcat.zip");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("tomcat_cp.zip");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int d = -1;
        while((d = bis.read()) != -1){
            bos.write(d);
        }

        System.out.println("复制完毕");
        bis.close();
        bos.close();

    }
}











