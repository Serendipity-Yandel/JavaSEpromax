package udp1;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class CilentDeom1 {
    public static void main(String[] args) throws Exception{
        System.out.println("客户端启动");
        //1.创建发送对象：发送端自带默认的端口号（人）
        DatagramSocket socket=new DatagramSocket(6666);

        //2.创建一个数据包封装数据
        /**
         * public DatagramPacket(byte buff[],int length,InetAddress address,int port)
         * 参数1：封装要发的数据
         * 参数2：发送的数据大小
         * 参数3：服务端的主机ip地址
         * 参数4：服务端的端口
         */

        byte[] buffer="响应式web开发，项目实战教程！".getBytes();
        DatagramPacket packet=new DatagramPacket(buffer, buffer.length,
                InetAddress.getLocalHost(),8888);

        //3.发送数据出去
        socket.send(packet);

        //4.关闭发送流
        socket.close();
    }
}
