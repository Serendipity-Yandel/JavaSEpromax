package AllTests_classes;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        new Receive().start();
        new Send().start();
    }
}
class Receive extends Thread {
    public void run(){
        try {
            //创建socket相当于创建码头
            DatagramSocket socket=new DatagramSocket(666);
            //创建packet相当于创建集装箱
            DatagramPacket packet=new DatagramPacket(new byte[1024],1024);
            while(true){
                socket.receive(packet);//接收货物
                byte[] arr= packet.getData();
                int len = packet.getLength();
                String ip=packet.getAddress().getHostAddress();
                System.out.println(ip+":"+new String(arr,0, len));
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class Send extends Thread  {
    public void run() {
        try {
            DatagramSocket socket=new DatagramSocket();
            Scanner sc=new Scanner(System.in);
            while(true){
                String str=sc.nextLine();
                if("quit".equals(str))
                    break;
                    DatagramPacket packet = new DatagramPacket(str.getBytes(),
                            str.getBytes().length, InetAddress.getByName("127.0.0.1"),6666);
                    socket.send(packet);


                socket.close();

            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
