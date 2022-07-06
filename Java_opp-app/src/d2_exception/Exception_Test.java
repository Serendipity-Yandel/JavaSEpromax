package d2_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exception_Test {
    public static void main(String[] args) throws ParseException {//抛是将异常往上抛，最终抛给JVM虚拟机，停止运行程序
        String date="2018-01-12 12:23:11";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d=sdf.parse(date);
        System.out.println(d);
    }
}
