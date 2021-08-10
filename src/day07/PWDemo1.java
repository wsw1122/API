package day07;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲字符流
 *  java.io.BufferedWriter
 *  java.io.BufferedReader
 * 缓冲字符流内部有缓冲区，读写字符效率高，并且可以按行读写字符串。
 *
 * 但是比较常用的缓冲字符输出流:PrintWriter，它内部链接BufferedWriter作为
 * 其缓冲加速，而它自身提供了自动的行刷新的功能
 */
public class PWDemo1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        /*
        PW提供了直接对文件操作的构造方法
         PrintWriter(String path)
         PrintWriter(File file)
        可以再传入一个String类型参数为字符集
         */
        PrintWriter pw = new PrintWriter("pw.txt","UTF-8");

        pw.println("如果那两个字没有颤抖，");
        pw.println("我不会发现我难受。");

        System.out.println("写出完毕。");

        pw.close();

    }
}













