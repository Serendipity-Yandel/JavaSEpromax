package Calendar_System_Random;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class DataTime {
    public static void main(String[] args){
            test1();
            test2();
            test3();
            test4();
            test5();
            test6();
    }

   public static void test1(){
        //获取现在的时间
         Date date=new Date();
        //格式化
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
       System.out.print(sdf.format(date));
   }
    public static void test2(){
        //生成随机数
        Random r=new Random();
        for (int i = 0; i < 4; i++) {
            int n=r.nextInt(10);
            System.out.print(n);
        }
        System.out.println("===========");
    }
//=======================================================================================================================

    /**
     写一个编码生成程序，格式要求总长16位：14位时间（yyyyMMddHHmmss）+4位随机数字（数字不足4位的用0补齐）
     */
    public static void test3(){

        Date date=new Date();
        System.out.println(date);
        //将时间格式化
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyHHddHHmmss");

        StringBuffer sbf=new StringBuffer(sdf.format(date));//将格式化的时间进行
        Random r=new Random();
        int temp=r.nextInt(10000);//0-9999
        if(temp<10){
            sbf.append("000").append(temp);
        }else if(temp<100){
            sbf.append("00").append(temp);
        }else if(temp<1000){
            sbf.append("0").append(temp);
        }else{
            sbf.append(temp);
        }
        System.out.println(sbf);
        System.out.println("长度是"+sbf.length());

    }

    /**
     用以上程序生成100个编码并计算执行所用的时间的执行时间（单位：ms）
     */
    public static  void test4(){

        long start =System.currentTimeMillis();//循环开始时的当前时间

        for (int i = 0; i < 100; i++) {
                                test3();//进行循环100次test3方法
        }
        long end=System.currentTimeMillis();//循环结束时的时间
        System.out.println("循环100次所需要的时间为"+(end-start)+"ms");
        System.out.println("==========================================");
    }

    /**
     计算199天后是哪一天？
     */
    public  static void test5(){
        Date date=new Date();

        Calendar now=Calendar.getInstance();
        now.setTime(date);//获取现在的时间

        now.add(Calendar.DATE,199);//增加199天的时间

        Date newDate=now.getTime();//获取增加后的时间

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//格式化时间

        System.out.println(sdf.format(newDate));//输出格式化的时间
        System.out.println("===========================================");

    }

    /**
     计算人从现在出生活到80岁生日当天的时候共有多少小时，多少分钟，多少秒 ？
     */
    public  static void test6(){
        //现在
        Date date =new Date();

        Calendar now=Calendar.getInstance();
        now.setTime(date);//setTime()方法表示使用能够给定的时间

        //增加80年
        now.add(Calendar.YEAR,80);//先将增加80年的数据返回到Calendar中

        //80年后
        Date newDate=now.getTime();//用getTime方法将calendar中80年后的时间赋值给newDate

        //时间差为
        long ms=newDate.getTime()-date.getTime();
        long hour=ms/(1000*60*60);//小时
        long m=ms/(1000*60);
        long s=ms/(1000);
        System.out.println("80年后还有"+hour+"小时");
        System.out.println("80年后还有"+m+"分钟");
        System.out.println("80年后还有"+s+"秒");
    }
}

