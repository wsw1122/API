package day07;

import java.io.*;

/**
 * 读取文本数据
 */
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("osw.txt");
        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");

//        int d = isr.read();
//        char c = (char)d;
//        System.out.println(c);

        int d = -1;
        while((d=isr.read())!=-1){
            System.out.print((char) d);
        }
        isr.close();

    }
}
