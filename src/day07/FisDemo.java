package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 文件输入流，用于从文件中读取字节
 */
public class FisDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("fos.txt");

        byte[] data = new byte[1024];
        int len = fis.read(data);

        String line = new String(data,0,len,"utf-8");
        System.out.println(line);

        fis.close();

    }
}

