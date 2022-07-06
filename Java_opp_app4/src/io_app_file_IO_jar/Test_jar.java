package io_app_file_IO_jar;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test_jar {
    public static void main(String[] args)throws Exception {
        //1，完成文件复制
        IOUtils.copy(new FileInputStream("G:\\javaFile\\Deom.txt"),new FileOutputStream("G:\\javaFile\\File"));
    }

}
