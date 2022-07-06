package io_app_file_Reader_Writer;

import java.io.FileReader;

public class Deom1_Reader {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("Java_opp_app4/src/io_app_file_Reader_Writer/deom.txt");
        //用来记录读取的字符
        int ch;
        while((ch=reader.read())!=-1){
            System.out.print((char)ch);
        }
        reader.close();

    }
}
