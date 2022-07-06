package udp4_multicast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;


/**
 * 接收端
 */

public class ServerDeom2 {
    public static void main(String[] args) throws  Exception {
        System.out.println("======服务段启动======");

        //1.创建接收对象：注册端口（人）
            MulticastSocket socket = new MulticastSocket(9999);


            //把当前接收端加入到一个组播中去：绑定对应的组播消息的组播ip
         socket.joinGroup(InetAddress.getByName("224.0.1.1"));

        //2.创建一个数据包对象接收数据
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        while (true) {
            //3.读取数据
            //读取多少到处多少
            socket.receive(packet);
            int len = packet.getLength();
            String rs = new String(buffer, 0, len);
            System.out.println("收到了来自" + packet.getAddress() + ",对方端口是" + packet.getPort() + "的消息是:" + rs);
        }
    }



}

