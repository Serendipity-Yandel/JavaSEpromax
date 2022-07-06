package udp4_multicast;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;


/**
 * 发送端 多发 多收
 */
public class CilentDeom1 {
    public static void main(String[] args) throws Exception{
        System.out.println("客户端启动");
        //1.创建发送对象：发送端自带默认的端口号（人）
        DatagramSocket socket=new DatagramSocket(6666);
        Scanner scanner=new Scanner(System.in);
        while (true) {
            //2.创建一个数据包封装数据
            System.out.println("请说");
            String msg=scanner.nextLine();

            if ("exit".equals(msg)){
                System.out.println("离线成功！");
                socket.close();
                break;
            }
            byte[] buffer=msg.getBytes();
            DatagramPacket packet=new DatagramPacket(buffer, buffer.length,
                    InetAddress.getByName("224.0.1.1"),9999);

            //3.发送数据出去
            socket.send(packet);
        }

    }
}
