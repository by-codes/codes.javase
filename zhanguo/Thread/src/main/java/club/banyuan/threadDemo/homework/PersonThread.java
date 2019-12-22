package club.banyuan.threadDemo.homework;

public class PersonThread implements  Runnable {

      Object object=new Object();//表示一线天

      @Override
      public void run() {
        show();
      }

      public   void show(){

        synchronized (object){
          try {
            Thread.currentThread().sleep(2000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println(Thread.currentThread().getName()+"抢到了...");
        }
      }
  }
