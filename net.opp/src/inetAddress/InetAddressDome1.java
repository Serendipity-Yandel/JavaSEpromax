package inetAddress;

import java.net.InetAddress;

public class InetAddressDome1 {
    public static void main(String[] args) throws Exception{
        //获取本机地址对象
        InetAddress ip1=InetAddress.getLocalHost();
        //本机ip姓名
        System.out.println(ip1.getHostName());
        //本机IP地址
        System.out.println(ip1.getHostAddress());


        //获取域名IP对象

        InetAddress ip2=InetAddress.getByName("www.baidu.com");
        //百度网址
        System.out.println(ip2.getHostName());
        //百度ip对象
        System.out.println(ip2.getHostAddress());

        System.out.println("==========================================");
        //判断能否接通
        InetAddress ip3=InetAddress.getByName("www.baidu.com");
        System.out.println(ip3.getHostName());
        System.out.println(ip3.getHostAddress());
        //判断5秒内能否接通
        System.out.println(ip3.isReachable(5000));
    }
}
