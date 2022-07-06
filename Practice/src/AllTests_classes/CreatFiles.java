package AllTests_classes;

import java.io.File;
import java.util.Random;

public class CreatFiles {
    public static void main(String[] args) {
        //获得三位数，并以期获得文件名
        String sum="";
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
        int n=random.nextInt(10);
        sum+=n;
        }
        String dir="text"+sum;
        System.out.println(dir);

        File file =new File("D:\\IOtest");
        for (int i = 0; i < 300; i++) {
            if (file.mkdirs()){
                System.out.println(file.getPath());
            }

        }
    }
}
