package io_app_file_Input_Output;

import java.io.File;

public class File_Deom3_delete {
    public static void main(String[] args) {

        File file=new File("G:\\javaFile\\AAA");
        deleteDir(file);

    }
    public static void deleteDir(File dir){
        if(dir.exists()){//判断传入的文件是否存在
            File [] files=dir.listFiles();//得到传入文件下的子文件并存放到数组中
            for(File file:files){
                if(file.isDirectory()){//如果是目录，继续调用deleteDir()方法，获得子目录
                    deleteDir(file);//
                }else{
                    //如果，不是文件夹，则进行删除
                    file.delete();
                }
            }
            //删除了一个目录中所有的文件后，删除这个目录
            dir.delete();
        }
    }
}
