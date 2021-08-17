package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class RAFLoginDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎登陆");
        System.out.println("请输入用户名称:");
        String username = scanner.nextLine();
        System.out.println("请输入密码:");
        String password = scanner.nextLine();

        boolean isLogin = false;

        try (RandomAccessFile raf = new RandomAccessFile("user1.dat","r")){
            for (int i = 0 ; i < raf.length()/100 ; i++){
                raf.seek(i*100);
                byte[] data = new byte[32];
                raf.read(data);
                String uName = new String(data,"utf-8").trim();
               // System.out.println(uName);
                if (username.equals(uName)){
                    //获取当前的密码进行判断是否一致
                    data = new byte[32];
                    raf.read(data);
                    String uPWD = new String(data,"utf-8").trim();
                    //System.out.println(uPWD);
                    if (password.equals(uPWD)){
                        System.out.println("登陆成功");
                        isLogin = true;
                        break;
                    }
                }


            }

            if (!isLogin){
                System.out.println("登陆失败!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
