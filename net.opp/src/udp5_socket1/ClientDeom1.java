package udp5_socket1;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
/**
    客户端
 * 目标:完成socket通信管道请求有服务短的连接
 */
public class ClientDeom1 {
    public static void main(String[] args) throws Exception{

            //1.创建socket通信请求管道请求服务端的连接
            //public Socket(String host,int port)
            //参数一:服务端的ip地址
            //参数二:服务端的端口
            Socket socket=new Socket("127.0.1.1",7777);

            //2.从socket通信管道中得到一个字节输出流  负责发消息
            OutputStream os=socket.getOutputStream();

            //3.把低级的字节流转换成打印流
            PrintStream printStream=new PrintStream(os);

            //4.发送消息
            printStream.println("我是TCP的客户端，我已经与你连接，并发出邀请，约吗？");
            printStream.flush();




    }
}
