package d1_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDeom {
    public static void main(String[] args) throws ParseException {
        //1，得到当前时间
        Date d=new Date();
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        System.out.println(sdf1.format(d));


        //2，当前时间往后走了1小时121秒
        long time=System.currentTimeMillis();
        time+=(60*60+121)*1000;

        //3，把时间毫秒值转换成对应时间
        Date d2=new Date(time);
        //将时间格式化
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");

        System.out.println(sdf2.format(d2));
        System.out.println("=======================================");



        //,把字符串时间解析成日期对象.parse()
        String daster="2022年4月22日 20:20:20";
        //将字符串时间解析
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date t=sdf.parse(daster);//解析String字符串

        //往后走2天 14小时 49分12秒
        long time2=t.getTime()+(2*60*60+14*60*60+12)*1000;//t.getTime()返回上面的时间

        //将时间格式化
        System.out.println(sdf.format(time2));

    }
}
