package finaExamAllTests;

class Bricks implements Runnable {
    private int time = 0;//记录时间
    public void run(){
        if (Thread.currentThread().getName().equals("张三")){
            zhangSan();    //计算张三搬砖所用时间的方法
        }else if(Thread.currentThread().getName().equals("李四")){
            liSi();    //计算李四搬砖所用时间的方法
        }
    }
    private synchronized void zhangSan(){
        time=(int)Math.ceil((double)100/(double)3)*10;
        System.out.println(Thread.currentThread().getName()+"搬完100块砖需要"+time+"分钟");

    }
    private synchronized void liSi(){
        time= 100/5*12;
        System.out.println(Thread.currentThread().getName()+"搬完100块砖需要"+time+"分钟");

    }
}
public class Example8_4 {
    public static void main(String[] args){
        Bricks bricks = new Bricks();
        new Thread(bricks,"张三").start();
        new Thread(bricks,"李四").start();
    }
}
