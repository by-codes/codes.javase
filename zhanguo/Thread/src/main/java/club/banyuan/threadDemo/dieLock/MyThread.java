package club.banyuan.threadDemo.dieLock;

public class MyThread  extends Thread {

  private  boolean  flag; //  告诉线程要执行哪个一块

  public MyThread(String name,boolean flag) {
    super(name);
    this.flag=flag;
  }
  @Override
  public void run() {
         //如果张三先进来了 首先要拿到其中一个锁  再拿另一个锁
       if(flag){
         synchronized (DieLock.objA){
           System.out.println(Thread.currentThread().getName()+"拿到了objA...");
           synchronized (DieLock.objB){
             System.out.println(Thread.currentThread().getName()+"拿到了objB...");
           }
         }
       }else {
         synchronized (DieLock.objB){
           System.out.println(Thread.currentThread().getName()+"拿到了objB...");
           synchronized (DieLock.objA){
             System.out.println(Thread.currentThread().getName()+"拿到了objA...");
           }
         }
       }
  }

}
