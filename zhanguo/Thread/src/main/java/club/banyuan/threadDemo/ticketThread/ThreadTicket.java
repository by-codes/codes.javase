package club.banyuan.threadDemo.ticketThread;

public class ThreadTicket  extends   Thread {

  static  int   ticket=100;

  public ThreadTicket(String name) {
    super(name);
  }
  @Override
  public void run() {
    while(true){
      if(ticket>0){
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"卖第"+(ticket--)+"张票...");

      }
    }
  }
}
