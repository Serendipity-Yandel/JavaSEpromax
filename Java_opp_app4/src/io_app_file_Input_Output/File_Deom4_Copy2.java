package io_app_file_Input_Output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class File_Deom4_Copy2 {
    public static void main(String[] args)throws Exception {
        InputStream in=new FileInputStream("Java_opp_app4/src/io_app_file_Input_Output/Copyhello.txt");

        OutputStream out=new FileOutputStream("Java_opp_app4/src/io_app_file_Input_Output/Copyhello2.txt");

        long beforeTime=System.currentTimeMillis();
        byte[] buff=new byte[1024];//1kb
        int len;
        while((len=in.read(buff))!=-1){//一次性读取一个数组字节，并把它赋给len
            out.write(buff,0,len);//一次性写入一个数组的字节（从0开始，写入len个字节）
        }
        long endTime=System.currentTimeMillis();

        System.out.println("复制文件所花的时间是"+(endTime-beforeTime)+"毫秒");
        in.close();
        out.close();
    }
}
