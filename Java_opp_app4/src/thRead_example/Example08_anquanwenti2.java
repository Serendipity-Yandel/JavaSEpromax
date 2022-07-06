package thRead_example;

class Ticket1 implements Runnable{
    private int tickets=10;
    Object lock=new Object();//定义一个对象用作同步代码块的锁
    @Override
    public void run() {
        while(true){
            synchronized (lock){//定义同步代码块
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (tickets>0){
                    System.out.println(Thread.currentThread().getName()+"----卖出的票"+tickets--);
                }else{
                    break;//如果票小于零,跳出循环
                }
            }
        }
    }
}

public class Example08_anquanwenti2 {
    public static void main(String[] args) {
        Ticket1 ticket1=new Ticket1();
        new Thread(ticket1,"线程一").start();
        new Thread(ticket1,"线程二").start();
        new Thread(ticket1,"线程三").start();
        new Thread(ticket1,"线程四").start();
    }
}
