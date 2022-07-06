package thRead_example;

public class Example07_chadui{
    //误区消除------------------不是先执行对象，而是有方法先执行方法，没有按main函数自上而下进行
    public static void main(String[] args) throws Exception {
        //创建线程
        Thread thread=new Thread(new EmergencyThread(),"线程");//获取实例化的EmergencyThread的线程
        thread.start();//开启线程

        for (int i = 1; i <6; i++) {
            if (i==2){
                thread.join();//调用join方法插队
            }
            System.out.println(Thread.currentThread().getName()+"输入为"+i);
            //Thread.sleep(500);//让线程休眠500毫秒
        }
    }
}
class EmergencyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(Thread.currentThread().getName()+"输入"+i);
            try {
                Thread.sleep(500);//让当前线程休眠500毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
