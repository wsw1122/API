package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 修改昵称
 *  程序启动后，要求用户输入用户名和新的昵称。
 *  然后将user.dat文件中对应的用户的昵称更改。
 *  如果输入的用户名不存在，则提示查无此人。
 */
public class UpdateDemo {
    public static void main(String[] args) throws IOException {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("请输入用户名:");
//        String username = scan.nextLine();
//
//        RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
//        raf.seek(0);
//        for (int i = 0; i <raf.length()/100 ; i++) {
//            byte[] data = new byte[32];
//            raf.read(data);
//            if(new String(data,"utf-8").trim().equals(username)){
//                raf.seek(i*100+64);
//                System.out.println("请输入新昵称:");
//                String nickname = scan.nextLine();
//                byte[] arr = nickname.getBytes("utf-8");
//                arr = Arrays.copyOf(arr,32);
//                raf.write(arr);
//                System.out.println("修改完毕");
//                return;
//            }
//            raf.seek((i+1)*100);
//        }
//        System.out.println("查无此人");
//        raf.close();

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = scan.nextLine();
        System.out.println("请输入新昵称:");
        String nickname = scan.nextLine();

        RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
        //是否有修改
        boolean update = false;
        for (int i = 0; i < raf.length()/100; i++) {
            raf.seek(i*100);
            byte[] data = new byte[32];
            raf.read(data);
            if(new String(data,"utf-8").trim().equals(username)){
                raf.seek(i*100+64);
                data = nickname.getBytes("utf-8");
                data = Arrays.copyOf(data,32);
                raf.write(data);
                System.out.println("修改完成!");
                update = true;
                break;
            }
        }
        if (!update) {
            System.out.println("查无此人");
        }

    }
}











