package club.banyuan.threadDemo.threadInterrupt;

import java.util.Date;

public class ThreadInterrupt  extends   Thread {

  @Override
  public void run() {
    System.out.println("start....."+new Date());
    for (int  i=0;i<20;i++){
      System.out.println(Thread.currentThread().getName()+"---->>>>"+i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
        System.out.println("线程抛了异常....");
      }
    }
    System.out.println("end....."+new Date());
  }
}
