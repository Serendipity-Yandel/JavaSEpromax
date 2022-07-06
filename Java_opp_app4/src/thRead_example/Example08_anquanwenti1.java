package thRead_example;

public class Example08_anquanwenti1 {
    public static void main(String[] args) throws Exception {
//        //创建四个线程，并开启
//        new Thread(new SleepThread(),"线程一").start();
//        new Thread(new SleepThread(),"线程二").start();
//        new Thread(new SleepThread(),"线程三").start();
//        new Thread(new SleepThread(),"线程四").start();

        SaleThread saleThread = new SaleThread();
        new Thread(saleThread, "线程一").start();
        new Thread(saleThread, "线程二").start();
        new Thread(saleThread, "线程三").start();
        new Thread(saleThread, "线程四").start();
    }
}
     class SaleThread implements Runnable {
        private int tickets=10;
        @Override
        public void run() {
            while(tickets>0){
                try{
                    Thread.sleep(10);
                }catch(Exception e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"----在售的票"+tickets--);
            }

        }
    }

