package club.banyuan.threadDemo.threadFour;

public class ThreadSleep   extends   Thread{

  /*
      sleep   线程休眠
   */

  public ThreadSleep(String name) {
    super(name);
  }

  @Override
  public void run() {
    for (int i = 0; i <20; i++) {

      System.out.println(Thread.currentThread().getName()+"---->>>>"+i);
//      try {
//        Thread.sleep((int)(Math.random()*1000)+1);  //拿到的cpu执行权会被释放  被后面线程抢占
//      } catch (InterruptedException e) {
//        e.printStackTrace();
//      }
      Thread.yield(); //线程让步  把当前资源让出来   暂定当前执行的线程

    }
  }
}
