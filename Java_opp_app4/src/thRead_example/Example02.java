package thRead_example;

public class Example02 {
    public static void main(String[] args) {
    TicketWindow ticketWindow=new TicketWindow();//实例化对象
        new Thread(ticketWindow,"窗口1").start();//获取线程对象，并将其调用start方法开始线程
        new Thread(ticketWindow,"窗口2").start();
        new Thread(ticketWindow,"窗口3").start();
        new Thread(ticketWindow,"窗口4").start();
    }
}
class TicketWindow implements Runnable{
    private int tickets=100;
    public void run(){
        while(true){
        if(tickets>0){
            Thread thread=Thread.currentThread();//获取当前线程
            String thread_name= thread.getName();//获取当前线程的名字
            System.out.println(thread_name+"正在发销售第"+tickets--+"张票");
        }
        }
    }
}
