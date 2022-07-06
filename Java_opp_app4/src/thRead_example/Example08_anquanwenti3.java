package thRead_example;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

class Tickrt2 implements Runnable{
    private int tickets=10;
    @Override
    public void run() {
        while(true){
            //调用售票方法
            saleTicket();
            if (tickets<=0){
                break;
            }
        }
    }
    //定义一个同步saleTicketet()
    private synchronized void saleTicket(){
        if (tickets>0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-----在售的票"+tickets--);
        }
    }
}
public class Example08_anquanwenti3 {
    public static void main(String[] args) {
//        new Thread(new Tickrt2(),"线程一").start();
//        new Thread(new Tickrt2(),"线程二").start();
//        new Thread(new Tickrt2(),"线程三").start();
//        new Thread(new Tickrt2(),"线程四").start();
        //还是用原始的方法写，不要图简洁（不要上面那种）
        Tickrt2 tickrt2=new Tickrt2();
        new Thread(tickrt2,"线程二").start();
        new Thread(tickrt2,"线程一").start();
        new Thread(tickrt2,"线程三").start();
        new Thread(tickrt2,"线程四").start();
    }
}
