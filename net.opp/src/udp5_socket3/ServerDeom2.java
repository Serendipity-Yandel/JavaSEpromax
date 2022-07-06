package udp5_socket3;


import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
    服务端
 目标：实现服务端同时处理多个客户端
 */
public class ServerDeom2 {
    public static void main(String[] args) throws Exception {
        System.out.println("======服务端启动成功======");
        //1.注册端口
        ServerSocket serverSocket=new ServerSocket(7777);
        //定义一个死循环有主线程负责不断地接受客户端的socket连接请求，建立socket通信管道
        while (true) {
            //2.没接到一个客户端的socket管道，交给一个独立的子线程负责读取消息
            Socket socket=serverSocket.accept();
            System.out.println(socket.getRemoteSocketAddress()+"它来了，上线了！！！");
            //3.创建独立线程处理socket
            new ServerReaderThread(socket).start();

        }
    }
}
