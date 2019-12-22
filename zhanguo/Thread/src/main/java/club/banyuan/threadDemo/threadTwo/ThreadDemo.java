package club.banyuan.threadDemo.threadTwo;

public class ThreadDemo   extends  Thread {
//
//  public ThreadDemo(String name) {
//    super(name);
//  }

  @Override
  public void run() {  //哪个线程先进来就显示哪个线程的名称

    for (int i = 0; i < 20; i++) {
      //System.out.println(this.getName()+"------->>>>"+i);
      System.out.println(Thread.currentThread().getName()+"------->>>>"+i);
    }

  }
}
