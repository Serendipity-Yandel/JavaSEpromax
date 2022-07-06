package thRead_example;

class MaxPriority implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"正在输出"+i);//当前的线程正在输出i
        }
    }
}
class MinPriority implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"正在输出"+i);
        }
    }
}
public class Example03_youxianji {
    public static void main(String[] args) {
    Thread minPriority= new Thread(new MinPriority(),"优先级较低的线程");//获取线程对象
    Thread maxPriority=new Thread(new MaxPriority(),"优先级较高的线程");
        //设置线程优先级
        minPriority.setPriority(Thread.MIN_PRIORITY);//设置线程的优先级为1
       maxPriority.setPriority(Thread.MAX_PRIORITY);//设置线程的优先级为10
       //开启两个线程
        minPriority.start();
       maxPriority.start();


    }
}

