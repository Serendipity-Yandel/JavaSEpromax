package udp5_socket4;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
    客户端
 * 目标:实现多发多收
 */
public class ClientDeom1 {
    public static void main(String[] args) throws Exception{
            System.out.println("=====客户端启动=====");
            //1.创建socket通信请求管道请求服务端的连接
            //public Socket(String host,int port)
            //参数一:服务端的ip地址
            //参数二:服务端的端口
            Socket socket=new Socket("127.0.1.1",7777);

            //2.从socket通信管道中得到一个字节输出流  负责发消息
            OutputStream os=socket.getOutputStream();

            //3.把低级的字节流转换成打印流
            PrintStream printStream=new PrintStream(os);


        Scanner scanner=new Scanner(System.in);
        while (true) {

            //4.发送消息
            System.out.println("请说：");
            String msg=scanner.nextLine();
            printStream.println(msg);
            printStream.flush();
        }


    }
}
