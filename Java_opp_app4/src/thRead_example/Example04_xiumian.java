package thRead_example;

public class Example04_xiumian {
    public static void main(String[] args) throws Exception{
        new Thread(new SleepThread()).start();//创建SleepThread的对象的线程，并用start方法进行
        for (int i = 0; i <=10 ; i++) {
            //如果i=5时，时间为2000毫秒时输出，其他数据为500毫秒延时输出
            if (i==5){
                Thread.sleep(2000);
            }
            System.out.println("主线正在执行输出"+i);
            Thread.sleep(500);
        }
    }
}
class SleepThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <=10; i++) {
            //如果i=3，时间改为2000毫秒时输出，其他数据为500毫秒输出
            if(i==3){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("sleepThread线程正在输出"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
