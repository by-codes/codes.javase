package club.banyuan.threadDemo.threadTwo;

public class TestThread {

  public static void main(String[] args) {

    ThreadDemo  threadDemo=new ThreadDemo();
   // threadDemo.run();
    threadDemo.start();   //线程的启动是调用 start方法...
    //threadDemo.start();  //java.lang.IllegalThreadStateException
    //相同的线程不能二次启动

    ThreadDemo  threadDemo2=new ThreadDemo();
   // threadDemo2.run();
    threadDemo2.start();

    //run 方法和start方法区别
    /*
        run 被线程对象调用那么就是一个普通方法
        start 被线程对象调用  start 会默认的 （JVM）去调用 run()方法
     */
    System.out.println(Thread.currentThread().getName()+"------");


  }



}
