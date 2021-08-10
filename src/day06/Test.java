package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 实现简易记事本工具:(写入文件的内容不考虑换行操作)
 *  程序启动后，要求用户输入一个文件名，然后开始对该文件写操作。
 *  之后用户输入的每一行字符串都写入到这个文件中，当用户输入"exit"时，程序退出。
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入文件名:");
        String fileName = scan.nextLine();

        RandomAccessFile raf = new RandomAccessFile(fileName,"rw");
        System.out.println("请输入文件内容:(输入 exit 退出)");
        while(true){
            String line = scan.nextLine();
            if("exit".equals(line)){
                break;
            }
            raf.write(line.getBytes("utf-8"));
        }
        System.out.println("再见.");
        raf.close();

    }
}



