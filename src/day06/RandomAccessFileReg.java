package day06;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

public class RandomAccessFileReg {


    public static void main(String[] args) {
            try (RandomAccessFile raf = new RandomAccessFile("user1.dat","rw")){
                Scanner scanner = new Scanner(System.in);
                System.out.println("欢迎注册会员！");
                System.out.println("请输入用户名:");
                String username = scanner.nextLine();
                System.out.println("请输入密码:");
                String password = scanner.nextLine();
                System.out.println("请输入昵称");
                String nickname = scanner.nextLine();
                System.out.println("请输入年龄");
                int age = scanner.nextInt();

                raf.seek(raf.length());
                //写账号
                byte[] data = username.getBytes("utf-8");
                data = Arrays.copyOf(data,32);
                raf.write(data);

                //写秘密
                data = password.getBytes("utf-8");
                data = Arrays.copyOf(data,32);
                raf.write(data);

                //写昵称
                data = nickname.getBytes("utf-8");
                data = Arrays.copyOf(data,32);
                raf.write(data);

                //写年龄
                raf.writeInt(age);
            } catch (IOException e) {
                e.printStackTrace();
            }


    }
}
