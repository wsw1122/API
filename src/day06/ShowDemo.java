package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 将user.dat文件中所有用户信息输出到控制台
 *  用户名，密码，昵称，年龄
 */
public class ShowDemo {
    public static void main(String[] args) throws IOException {

        RandomAccessFile raf = new RandomAccessFile("user.dat","r");

        for (int i = 0; i < raf.length()/100; i++) {
            //读取用户名
            byte[] data = new byte[32];
            raf.read(data);
            String username = new String(data,"utf-8").trim();
            raf.read(data);
            String password = new String(data,"utf-8").trim();
            raf.read(data);
            String nickname = new String(data,"utf-8").trim();
            int age = raf.readInt();

            System.out.println(username+","+password+","+nickname+","+age);
        }
        raf.close();
    }
}





