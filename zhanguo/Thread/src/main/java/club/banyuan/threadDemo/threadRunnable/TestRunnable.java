package club.banyuan.threadDemo.threadRunnable;

public class TestRunnable {

  public static void main(String[] args) {
    ThreadDemo  threadDemo=new ThreadDemo();
    Thread t=new Thread(threadDemo);
    t.start();

  }
}
