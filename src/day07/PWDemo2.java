package day07;

import java.io.*;

/**
 * 在流连接使用PW
 */
public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //字节输出流
        FileOutputStream fos = new FileOutputStream("fos.txt");
        //转换流
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
        //缓冲字符流
        BufferedWriter bw = new BufferedWriter(osw);
        //自动行刷新的字符输出流
        PrintWriter pw = new PrintWriter(bw);

        pw.println("内容随意");

        pw.close();

    }
}




