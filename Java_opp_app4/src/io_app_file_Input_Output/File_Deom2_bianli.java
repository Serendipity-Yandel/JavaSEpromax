package io_app_file_Input_Output;

import java.io.File;

public class File_Deom2_bianli {
    public static void main(String[] args) {
//        File file=new File("G:\\javaFile");
//        if(file.isDirectory()){//判断file对象对应的目录是否存在
//            String[] names=file.list();//获得目录下的所有文件
//            for(String name:names){
//                System.out.println(name);
//            }
//        }
        /**
         递归思想遍历目录
         */
        File file2=new File("G:\\javaFile");
        fileDir(file2);
    }
    public static  void  fileDir(File dir){
        File[] files=dir.listFiles();//将该目录下的子文件全部存放到files数组中
        for(File file:files){
            if(file.isDirectory()){
                fileDir(file);//如果是目录，递归调用fileDir(),继续将该目录下的子文件存放到files数组中
            }
            System.out.println(file.getAbsolutePath());//输出文件的绝对路径
        }

    }

}
