package day07;

import java.io.*;

/**
 * 字符流：
 *  java将流按照读写数据单位划分：
 *   字节流：以字节为单位读写数据，超类:InputStream,OutputStream
 *   字符流：以字符为单位读写数据，超类:Reader,Writer
 *
 *  字符流底层实际还是按照字节形式读写，但是字符与字节的转换操作字符流自行完成。
 *  所以字符流只适合读写文本数据。
 *
 *  转换流：
 *   java.io.OutputStreamWriter
 *   java.io.InputStreamReader
 *  是一对高级流，是可以连接在字节流上的字符流。
 *  实际应用中当我们读写文本数据时通常不会直接操作这对流，但是他们在流连接
 *  中是非常重要的一环。
 *
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("osw.txt");
        /*
          将写出的文本数据转换为字节。
          如果不指定第二个参数，则是按照系统默认字符集。
          指定后则按照指定的字符集转换。
         */
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");

//        fos.write("鬼刀一开看不见".getBytes("utf-8"));
        osw.write("夜空中最亮的星，");
        osw.write("能否想起，");
        osw.write("那仰望的人心底的孤独与叹息。");

        System.out.println("写出完毕");
        osw.close();

    }
}
