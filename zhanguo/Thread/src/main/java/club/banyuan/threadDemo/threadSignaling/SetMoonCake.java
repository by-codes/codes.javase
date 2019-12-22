package club.banyuan.threadDemo.threadSignaling;

public class SetMoonCake extends Thread {

  MoonCake moonCake;
  int count = 0;

  public SetMoonCake(MoonCake moonCake) {
    this.moonCake = moonCake;
  }

  @Override
  public void run() {
    //进行月饼生产  生产两种月饼
    while (true) {
      synchronized (moonCake) {
        if(moonCake.flag){
          try {
            moonCake.wait();  //当前对象所在线程再等待的时候会把对象锁释放   当前线程不会去抢占资源
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        if (count % 2 == 0) {
          moonCake.name = "大白兔月饼";
          moonCake.weight = 0.5;
        } else {
          moonCake.name = "小龙人月饼";
          moonCake.weight = 0.3;
        }
        count++;
        moonCake.flag=true;
        moonCake.notify();  //唤醒等待线程
      }
    }
  }
}
