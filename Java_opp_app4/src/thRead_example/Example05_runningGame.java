package thRead_example;


//成员内部类（兔子类和乌龟类都在同一个Example中）
public class Example05_runningGame {
    public static void main(String[] args)throws Exception {
        Example05_runningGame output=new Example05_runningGame();
        tortoise tortoise=output.new tortoise();
        rabbit rabbit=output.new rabbit();
        rabbit.start();
        tortoise.start();

    }
    private int rabbitDistance;
    private int tortoiseDistance;
    /**
     乌龟 1米每1000毫秒
     */
    class tortoise extends Thread {
        public void run(){
            //每1米的距离来判断
            for (int i = 1; i <=1000; i++) {
                if(rabbitDistance==800){
                    System.out.println("兔子赢得了比赛，此时乌龟才跑了"
                            +tortoiseDistance +"米");
                    break;
                }else{
                    tortoiseDistance+=1;
                    //每当乌龟跑了100时
                    if (tortoiseDistance%100==0){
                        try {
                            if (rabbitDistance==600){
                                System.out.println("乌龟跑了"+tortoiseDistance+"米，此时兔子在睡觉");
                            }else{
                                System.out.println("乌龟跑了"+tortoiseDistance+"米，兔子跑了"+rabbitDistance+"米");
                            }
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        }
    }

    /**
     兔子   1.2米每1000毫秒
     */
    class rabbit extends Thread {
        public void run(){
            //每1.2米的距离来判断
            for (int i = 1; i <=1000.0/1.2; i++) {
                //先判断乌龟有没有到达终点
                if(tortoiseDistance==1000){
                    System.out.println("乌龟达到终点，兔子最终跑了"+rabbitDistance+"米");
                    break;
                }else {
                    rabbitDistance += 1.2;
                    //每当兔子跑了120米时
                    if (rabbitDistance % 120 == 0) {
                        try {
                            System.out.println("兔子跑了" + rabbitDistance + "米" + "乌龟跑了"
                                    + tortoiseDistance + "米");
                            if (rabbitDistance == 600) {
                                System.out.println("兔子觉得自己自己不可能输，于是在睡觉");
                                Thread.sleep(12000);
                            }
                            Thread.sleep(1000);

                    } catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                }


                }

            }
        }

    }





