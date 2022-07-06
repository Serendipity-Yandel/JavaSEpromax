package thRead_example;

public class Example06_rangbu {
    public static void main(String[] args) {
        //创建两个线程
        Thread thread1=new YieldThread("线程A");//由于YieldThread继承了thread的父类，所以实例化像可用它
        Thread thread2=new YieldThread("线程B");

        //开启两个线程
        thread1.start();
        thread2.start();
    }
    static class YieldThread extends Thread {
    //定义一个有参构造器
        public YieldThread (String name){
            super(name);//调用父类的构造器
        }
        public void run(){
            for (int i = 0; i < 6; i++) {
               //获取当前的线程和名字
                System.out.println(Thread.currentThread().getName()+"-------"+i);
                if (i==3){
                    System.out.print("线程让步");
                    Thread.yield();//线程到此进行让步
                }

            }
        }
    }
}
