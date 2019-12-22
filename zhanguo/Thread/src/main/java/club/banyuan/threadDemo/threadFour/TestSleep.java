package club.banyuan.threadDemo.threadFour;

public class TestSleep {

  public static void main(String[] args) throws InterruptedException {
    ThreadSleep ts1 = new ThreadSleep("线程A");
    ThreadSleep ts2 = new ThreadSleep("线程B");
    ThreadSleep ts3 = new ThreadSleep("线程C");

    ts1.start();

    //ts1.join();  //让后面线程等待  ts1先执行完毕

    ts2.start();
    ts3.start();



  }
}
