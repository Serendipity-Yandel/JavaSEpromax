package udp5_socket3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReaderThread  extends  Thread{
    private Socket socket;
    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try{
            //3.从socket通信管道中得到一个字节输入流
            InputStream inputStream = socket.getInputStream();
            //4.把字节流包装成字符输入流进行消息的接收
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
            //5.按照行读取消息
            String msg;
            while ((msg=bufferedReader.readLine())!=null){
                System.out.println(socket.getRemoteSocketAddress()+"说了:"+msg);
            }
        }catch (Exception e){
            System.out.println(socket.getRemoteSocketAddress()+"下线了！！！");
        }
    }


}
