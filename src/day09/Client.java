package day09;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 聊天室客户端
 */
public class Client {
    /*
      java.net.Socket 套接字
        Socket封装了底层TCP协议的通讯细节，使用它可以通过TCP协议与服务端建立连接。
        并以两条流进行IO操作完成与服务端的数据交换。
     */
    private Socket socket;

    /** 初始化Socket*/
    public Client(){
        /*
        实例化Socket时使用的构造方法为:
         Socket(String host,int port)
          第一个参数为服务端的IP地址信息
          第二个参数为服务端的开启的服务端口
         注：这里实例化Socket的过程就是连接服务端的过程，
         若指定的地址和端口对应的服务端没有响应则抛出异常

         IP地址 -- 可以找到网络上服务端所在的计算机
         端口 -- 可以连接到该机器上对应的服务端应用程序
         */
        try {
            System.out.println("正在连接服务端...");
            socket = new Socket("localhost",8088);
            System.out.println("已连接服务端!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /** 客户端开始的方法*/
    public void start(){
        try{
            /*
            Socket提供的方法
             OutputStream getOutputStream();
             通过Socket获取的字节输出流写出的数据会通过网络发送给远端计算机(服务端)
             */
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);
//            pw.println("你好!");
            Scanner scan = new Scanner(System.in);
            while(true){
                String message = scan.nextLine();
                pw.println(message);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /** 启动程序*/
    public static void main(String[] args) {
        Client client = new Client();//启动一个客户端
        client.start();//调用启动方法
    }

}

















