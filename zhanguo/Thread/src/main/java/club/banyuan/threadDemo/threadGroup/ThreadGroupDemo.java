package club.banyuan.threadDemo.threadGroup;

public class ThreadGroupDemo {

  /*
    线程组:
      方便管理线程  可以设置统一的一些属性   比如说 部分线程是守护线程  setDaemon()
      设置未处理异常的处理方法 设置一些安全策略等等
    线程池:管理线程的声明周期，重复调用线程 减少线程的创建和销毁

   */

  public static void main(String[] args) {
    ThreadGroup  t=new ThreadGroup("javaSE");
    MyThread myThread=new MyThread();

    Thread  t1=new Thread(t,myThread,"线程A");
    Thread  t2=new Thread(t,myThread,"线程B");

    //t.setDaemon(true);
    //t.destroy();


    Thread  t3=new Thread(t,myThread,"线程C");
    Thread  t4=new Thread(t,myThread,"线程D");

    t1.start();   //  x   ---->t1
    t2.start();   //  y
    t3.start();   //  z
    t4.start();   //  m

    System.out.println(t.getParent().activeCount());


  }

  public static void show(Thread thread) {
    ThreadGroup threadGroup = thread.getThreadGroup();
    System.out.println(threadGroup.getName());

  }


}
