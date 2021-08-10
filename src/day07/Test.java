package day07;

import java.io.*;
import java.util.Scanner;

/**
 * 简易记事本工具
 *  程序启动后，要求用户输入文件名，然后对该文件写操作。
 *  之后用户在控制台输入的每一行字符串都按行写入该文件。
 *  若用户输入"exit"时，程序退出。
 *
 * 使用PW完成写操作，并且创建要求自行创建流连接
 */
public class Test {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输出文件名:");
        String fileName = scan.nextLine();

        FileOutputStream fos = new FileOutputStream(fileName);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
        BufferedWriter bw = new BufferedWriter(osw);
        /*
        在流连接中创建PW时，构造方法允许我们在传入一个boolean型参数
        (注: 构造方法第一个参数是流类型才可以)。
        当值true时，那么当前PW就具有自动行刷新功能。
        (println方法会自动调用flush方法，需要注意print是不会自动flush方法)
         */
        PrintWriter pw = new PrintWriter(bw,true);

        while(true){
            String line = scan.nextLine();
            if("exit".equals(line)){
                break;
            }
            pw.println(line);
//            pw.flush();
        }

        System.out.println("再见");
        pw.close();


    }
}








