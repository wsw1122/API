package day09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 聊天室服务端
 */
public class Server {
    /*
     运行在服务端的ServerSocket主要有两个作用:
       1:向系统申请服务端口，客户端就是通过这个端口与服务端建立链接的。
       2:监听该端口，这样一来客户端通过这个端口链接时，ServerSocket会自动实例化
       一个Socket与客户端建立链接。这样服务端与客户端各有一个Socket，就可以进行双向通讯了。
    */
    private ServerSocket server;

    /**
     * 初始化服务端
     */
    public Server() {
        try {
            System.out.println("正在启动服务端...");
            /*
			 实例化ServerSocket时需要指定服务端口该端口不能与当前系统运行的其他应用程序
			 已经申请的端口冲突，否则会抛出地址已占用的异常。
			 */
            server = new ServerSocket(8088);
            System.out.println("启动服务端完毕!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 服务端开始工作
     */
    public void start() {
        try {
            /*
             Socket accept()
			  这是一个阻塞方法，调用后程序会"卡住",这时就开始监听服务端口，直到一个客户端
			  通过这个端口建立链接,方法才会执行完毕并返回Socket实例，通过这个Socket实例就
			  可以与该客户端进行交互了。

			  多次调用accept方法可以接受多个客户端的链接。
             */
//            while(true){
                System.out.println("等待客户端连接...");
                Socket socket = server.accept();
                System.out.println("客户端已连接!!!");

                /*
                通过Socket获取输入流，可以读取到远端计算机发送过来的字节
                 */
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in,"UTF-8");
                BufferedReader br = new BufferedReader(isr);
    //            String line = br.readLine();
    //            System.out.println("客户端说:"+line);
                /*
                通过BufferedReader读取客户端发送过来的一行字符串这个操作中，当客户端断开连接时，
                由于客户端系统不同，服务端这个的表现也不相同。
                    window客户端断开连接:readLine()会直接抛出异常
                    linux客户端断开连接:readLine()会返回null值
                 */
                String message = null;
                while((message = br.readLine()) != null){
                    System.out.println(message);
                }
//            }

            } catch (IOException e) {
                e.printStackTrace();
            }

    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }


}
