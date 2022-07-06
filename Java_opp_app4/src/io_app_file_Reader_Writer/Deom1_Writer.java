package io_app_file_Reader_Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class Deom1_Writer {
    public static void main(String[] args) throws Exception{
        //FileWriter writer = new FileWriter("Java_opp_app4/src/io_app_file_Reader_Writer/deom2.txt");
        FileWriter writer=new FileWriter("Java_opp_app4/src/io_app_file_Reader_Writer/deom.txt",true);
        String str="来自未来的你";
        writer.write(str);
        writer.write("\r\n");
        writer.close();

    }
}
