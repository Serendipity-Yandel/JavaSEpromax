package io_app_file_Input_Output;

import java.io.*;

public class File_Deom4_Copy1 {
    public static void main(String[] args) throws Exception {
        //创建一个字节输入流，用于读取当前目录下的hello.txt文件
        InputStream in = new FileInputStream("Java_opp_app4/src/io_app_file/hello.txt");
        //创建一个文件字节输出流，用于将上面的文件写入别的文件
        OutputStream out=new FileOutputStream("Java_opp_app4/src/io_app_file/Copyhello.txt");
        int len;//定义len,用于记录每次读取的一个字节
        //获取读取文件前的时间
        long beginTime =System.currentTimeMillis();
        while((len=in.read())!=-1){//read读完到最后一个字符时，返回-1
            out.write(len);//将读取到的字节写入文件
        }
        //获取读完字节时的时间
        long endTime=System.currentTimeMillis();
        System.out.println("复制文件所消耗的时间是"+(endTime-beginTime)+"毫秒");
        //关闭流，先关读取流，在关读取流
        in.close();
        out.close();
    }
}
