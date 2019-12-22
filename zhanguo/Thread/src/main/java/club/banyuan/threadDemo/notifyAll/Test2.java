package club.banyuan.threadDemo.notifyAll;

public class Test2  extends Thread {

  Test1  test1;

  public Test2(String name,Test1 test1) {
    super(name);
    this.test1=test1;
  }

  @Override
  public void run() {
    synchronized (test1){
      test1.notifyAll();  //唤醒等待   唤醒目标线程
      System.out.println(Thread.currentThread().getName()+"test2线程进来了...");
    }
  }
}
