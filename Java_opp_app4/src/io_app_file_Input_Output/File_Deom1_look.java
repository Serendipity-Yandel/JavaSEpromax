package io_app_file_Input_Output;

import java.io.File;
import java.io.IOException;

public class File_Deom1_look {
    public static void main(String[] args) throws IOException {
        //指定的文件路径(绝对路径）
        File io=new File("G:\\javaFile\\deom.txt");
        //判断文件下是否存在deom.txt，如果存在，则删掉，不存在，则创建文件
        if(io.exists()){
            io.delete();
        }else{
            System.out.println(io.createNewFile());
        }
        //文件的字节大小
        long size=io.length();
        System.out.println(size);

        //相对文件路径
        File io2=new File("Java_opp_app4/src/io_app_file/hello.txt");
        System.out.println(io2.length());

    }
}
