package AllTests_classes;

import java.io.*;

public class CheakFile {
    public static void main(String[] args) throws Exception{

    File file=new File("D:\\IOtest");
        File io=new File("D:\\HelloWorld");
        if(io.exists()) {
            System.out.println(io.isDirectory());
        }
    if(file.isDirectory()){
        String[]names= file.list();
        for(String name:names){
            System.out.println(name);
        }
    }

}
}
