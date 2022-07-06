package udp5_socket1;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
    服务端
 目标：开发socket网络编程入门代码的服务端，实现接收消息
 */
public class ServerDeom2 {
    public static void main(String[] args) throws Exception {
        System.out.println("======服务端启动成功======");
        //1.注册端口
        ServerSocket serverSocket=new ServerSocket(7777);

        //2.必须调用accept方法，等待接收客户端的socket连接请求，建立socket通信管道
        Socket socket=serverSocket.accept();
        //3.从socket通信管道中得到一个字节输入流
        InputStream inputStream = socket.getInputStream();
        //4.把字节流包装成字符输入流进行消息的接收
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
        //5.按照行读取消息
        String msg;
        if ((msg=bufferedReader.readLine())!=null){
            System.out.println(socket.getRemoteSocketAddress()+"说了:"+msg);
        }
    }
}
