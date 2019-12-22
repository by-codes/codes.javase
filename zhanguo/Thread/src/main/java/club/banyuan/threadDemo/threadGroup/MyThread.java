package club.banyuan.threadDemo.threadGroup;

public class MyThread  implements  Runnable {

  @Override
  public void run() {
//    try {
//      Thread.sleep(2000);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
    System.out.println("当前线程.."+Thread.currentThread().getName());
  }
}
