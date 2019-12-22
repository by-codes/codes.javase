package club.banyuan.threadDemo.threadThree;


public class TestThread {

  public static void main(String[] args) {

    ThreadDemo  threadDemo=new ThreadDemo("线程A");
    //线程的启动是调用 start方法...
    ThreadDemo  threadDemo2=new ThreadDemo("线程B");
    ThreadDemo  threadDemo3=new ThreadDemo("线程C");
    ThreadDemo  threadDemo4=new ThreadDemo("线程D");

//    threadDemo.setPriority(2);
//    threadDemo2.setPriority(1);
//    threadDemo3.setPriority(9);
//    threadDemo4.setPriority(6);

    /**
     * 线程调度:
     *   线程有两种调度模型:
     *      1.分时调度模型
     *      2.抢占式调度模型
     */


    threadDemo.setDaemon(true); // 设置为后台线程
      threadDemo.start();
      threadDemo2.start();
      threadDemo3.start();
      threadDemo4.start();





  }
}
