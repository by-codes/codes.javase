package club.banyuan.threadDemo.notifyAll;

import sun.awt.windows.ThemeReader;

public class TestNotifyAll {


  public static void main(String[] args) {

    Test1  test1=new Test1();
    Thread  t1=new Thread(test1,"线程A");
    Thread  t2=new Thread(test1,"线程B");
    Thread  t3=new Thread(test1,"线程C");

    Test2  t5=new Test2("唤醒线程",test1);
    t1.start();
    t2.start();
    t3.start();

    try {
      System.out.println(Thread.currentThread().getName()+"在休眠...");
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    t5.start();
  }

}
