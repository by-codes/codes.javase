package club.banyuan.threadDemo.threadInterrupt;

public class ThreadTest {

  public static void main(String[] args) {

    ThreadInterrupt  ti1=new ThreadInterrupt();
    ThreadInterrupt  ti2=new ThreadInterrupt();
    ThreadInterrupt  ti3=new ThreadInterrupt();
    ti1.start();
    try {
      Thread.sleep(200);
      //ti1.stop();
      ti1.interrupt();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    ti2.start();
    ti3.start();
  }
}
