package thRead_example;

import sun.font.FontRunIterator;

public class Example09_SVIP {
    public static void main(String[] args) {
    comment comment=new comment();
    new Thread(comment).start();
    }

}

class comment extends Thread{
    @Override
    public void run() {
        System.out.println("普通用户正在办理时");
        System.out.println("这时有位SVIP客户来了");
        Thread thread=new Thread(new Svip(),"SVIP用户");
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
class Svip extends Thread{

    @Override
    public void run() {
        for (int i = 3; i> 0; i--) {
            System.out.println(Thread.currentThread().getName() + "进入，SVIP正在处理中，倒计时" + i + "秒");


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("SVIP用户正在处理中~~~~~~");
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("SVIP办理完成");
        System.out.println("普通用户继续排队");
    }
}
