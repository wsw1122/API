package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *用户注册功能
 *  程序启动后，用户输入用户名，密码，昵称，年龄四项，然后将信息写入到user.dat文件中。
 *  其中用户名，密码，昵称为字符串，年龄为int类型
 *
 *  格式: 每条记录占用固定的100字节
 *  其中用户名，密码，昵称各占32字节，为字符串，年龄为int值，固定4字节。
 */
public class RegDemo {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = scan.nextLine();
        System.out.println("请输入密 码:");
        String password = scan.nextLine();
        System.out.println("请输入昵 称:");
        String nickname = scan.nextLine();
        System.out.println("请输入年 龄:");
        int age = Integer.parseInt(scan.nextLine());

        RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
        //将指针移动文件末尾
        raf.seek(raf.length());
        //写用户名
        byte[] data = username.getBytes("utf-8");
        //扩容到32字节
        data = Arrays.copyOf(data,32);
        raf.write(data);//写出32字节
        //写密码
        data = password.getBytes("utf-8");
        data = Arrays.copyOf(data,32);
        raf.write(data);//写出32字节
        //写昵称
        data = nickname.getBytes("utf-8");
        data = Arrays.copyOf(data,32);
        raf.write(data);//写出32字节
        //写年龄
        raf.writeInt(age);
        System.out.println("注册完毕");
        raf.close();

    }
}












