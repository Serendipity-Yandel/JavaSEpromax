package IP_TCP;

import java.net.InetAddress;

public class Example01 {
    public static void main(String[] args) throws Exception {
        InetAddress localAddress = InetAddress.getLocalHost();//获得指定主机对象
        System.out.println("本机的ip地址为："+localAddress.getHostAddress());


    }
}
