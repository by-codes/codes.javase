package club.banyuan.threadDemo.ticketThread;

public class TestRunnable {

  public static void main(String[] args) {
    ThreadRunnable  threadRunnable=new ThreadRunnable();

    Thread t1=new Thread(threadRunnable,"窗口A");
    Thread t2=new Thread(threadRunnable,"窗口B");
    Thread t3=new Thread(threadRunnable,"窗口C");
    Thread t4=new Thread(threadRunnable,"窗口D");
    t1.start();
    t2.start();
    t3.start();
    t4.start();




  }

}
