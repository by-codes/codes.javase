package club.banyuan.threadDemo.threadSignaling;

public class GetMoonCake extends  Thread {

  MoonCake  moonCake;

  public GetMoonCake(MoonCake moonCake){
    this.moonCake=moonCake;
  }
  @Override
  public void run() {
      while (true){
        synchronized (moonCake) {
          if(!moonCake.flag){
            try {
              moonCake.wait();
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
          System.out.println("得到的月饼名称:" + moonCake.name + ",重量:" + moonCake.weight);
          moonCake.flag=false;
          moonCake.notify();//唤醒等待的线程
        }
      }
  }
}
