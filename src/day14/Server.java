package day14;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

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
     * 用来存放所有ClientHandler内部对应客户端的输出流，用于
     * 广播消息
     */
//    private PrintWriter[] allOut = {};
    private Collection<PrintWriter> allOut = new ArrayList<>();

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
            while(true){
                System.out.println("等待客户端连接...");
                Socket socket = server.accept();
                System.out.println("客户端已连接!!!");

                //启动一个线程来完成与该客户端的交互工作
                ClientHandler handler = new ClientHandler(socket);
                Thread t = new Thread(handler);
                t.start();
            }

            } catch (IOException e) {
                e.printStackTrace();
            }

    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    /**
     * 该线程任务是负责与指定的客户端进行交互
     */
    private class ClientHandler implements Runnable{
        private Socket socket;
        public ClientHandler(Socket socket){
            this.socket = socket;
        }
        public void run() {
            PrintWriter pw = null;
            try {
                /*
                通过Socket获取输入流，可以读取到远端计算机发送过来的字节
                获得客户端发送过来的数据输入流
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

                //获得发送到客户端信息的输出流
                OutputStream out = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
                BufferedWriter bw = new BufferedWriter(osw);
                pw = new PrintWriter(bw,true);

                //为了防止并发问题出现，所以对allOut数组加同步锁
                synchronized (allOut){
                    //将不同用户所对应的输出流存入到allOut中用于共享广播数据
                    //对数组扩容
//                    allOut = Arrays.copyOf(allOut,allOut.length+1);
                    //将输出流存入到数组的最后一个位置
//                    allOut[allOut.length-1] = pw;
                    allOut.add(pw);
                }

//                System.out.println("当前上线人数："+ allOut.length);
                System.out.println("当前上线人数："+ allOut.size());

                String message = null;
                /**
                 * 这里使用缓冲字符流的readLine方法读取客户端
                 * 发送过来的一行字符串时，如果客户端断开了连接
                 * 此时由于客户端系统不同，这里的反应也不同通常
                 * Windows的客户端断开连接时，readLine方法会直接
                 * 抛出异常。
                 */
                while((message = br.readLine()) != null){
                    System.out.println(message);
                    //遍历输出数组，向所有客户端输出信息
//                    for(int i = 0;i<allOut.length;i++){
//                        allOut[i].println(message);
//                    }
                    for (PrintWriter p : allOut) {
                        p.println(message);
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            //断开连接以后数组缩容
            }finally {
                //处理与该客户端断开连接后的操作
                synchronized (allOut){
//                    for (int i = 0;i<allOut.length;i++){
//                        if(allOut[i] == pw){
//                            allOut[i] = allOut[allOut.length-1];
//                            allOut = Arrays.copyOf(allOut,allOut.length-1);
//                            break;
//                        }
//                    }
                    allOut.remove(pw);
                }
//                System.out.println("有客户端下线了，当前在线人数："+allOut.length);
                System.out.println("有客户端下线了，当前在线人数："+allOut.size());
                try{
                    socket.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }


}
