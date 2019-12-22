package club.banyuan.threadDemo.ticketThread;

public class ThreadRunnable implements Runnable {

 // Object obj=new Object();
    Student student=new Student();
  int ticket = 50;
  boolean flag=true;
  int  x=0;


  @Override
  public void run() {
    while(x<50){
        if(x%2==0){
          show();
        }else{
          show1();
        }
        x++;
    }

  }

  public  synchronized    void   show(){  //   this

        if (ticket > 0) {
//          try {
//            Thread.sleep((int)(Math.random()*1000)+1);
//          } catch (InterruptedException e) {
//            e.printStackTrace();
//          }
          System.out.println(Thread.currentThread().getName() + "卖第" + (ticket--) + "张票...");
        }else{
          flag=false;
        }
      }
  public  synchronized    void   show1(){  //   同步方法的对象锁是this

    if (ticket > 0) {
//      try {
//        Thread.sleep((int)(Math.random()*1000)+1);
//      } catch (InterruptedException e) {
//        e.printStackTrace();
//      }
      System.out.println(Thread.currentThread().getName() + "卖第" + (ticket--) + "张票...");
    }else{
      flag=false;
    }
  }

  //静态的同步方法锁是 类的字节码文件



}
