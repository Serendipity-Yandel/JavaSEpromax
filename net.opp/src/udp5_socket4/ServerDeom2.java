package udp5_socket4;


import udp5_socket3.ServerReaderThread;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
    服务端
 目标：实现服务端同时处理多个客户端
 */
public class ServerDeom2 {

        //使用静态变量记住一个线程对象（线程池）
    private static ExecutorService pool=new ThreadPoolExecutor(3, 5,6, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());


    public static void main(String[] args) throws Exception {
        System.out.println("======服务端启动成功======");

        //1.注册端口
        ServerSocket serverSocket=new ServerSocket(7777);

        //定义一个死循环有主线程负责不断地接受客户端的socket连接请求，建立socket通信管道
        while (true) {

            //2.接到一个客户端的socket管道，交给一个独立的子线程负责读取消息
            Socket socket=serverSocket.accept();
            System.out.println(socket.getRemoteSocketAddress()+"它来了，上线了！！！");

            //任务负责读取消息
            Runnable target=new ServerReaderRunnable(socket);
            pool.execute(target);

        }
    }
}
