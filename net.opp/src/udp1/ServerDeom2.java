package udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServerDeom2 {
    public static void main(String[] args) throws  Exception{
        System.out.println("======服务段启动======");

        //1.创建接收对象：注册端口（人）
        DatagramSocket socket=new DatagramSocket(8888);

        //2.创建一个数据包对象接收数据
        byte[] buffer=new byte[1024*64];
        DatagramPacket packet=new DatagramPacket(buffer, buffer.length);
        //3.读取数据
        //读取多少到处多少
        socket.receive(packet);
        int len= packet.getLength();
        String rs=new String(buffer,0,len);

        System.out.println("收到了"+rs);

        //获取发送端口的ip和端口
        String ip=packet.getSocketAddress().toString();
        System.out.println("对方地址"+ip);

        int port =packet.getPort();

        System.out.println("对方端口"+port);

        socket.close();
    }
}

