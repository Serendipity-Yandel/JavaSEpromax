package thRead_example;



public class Example01 {
    public static void main(String[] args) {
//        Thread thread=new Thread(new MyThread()) ;//先实例化MyThread,再创建线程对象
//        thread.start();//开启线程
        //简写上面的
        new Thread(new MyThread()).start();
        while(true){
            System.out.println("mian方法在执行");
        }
    }

}

        //创建MyThread父类，继承Runnable的接口
class MyThread implements Runnable{
    public void run(){
    while(true){
        System.out.println("MyThread方法在执行");
    }
    }
}
