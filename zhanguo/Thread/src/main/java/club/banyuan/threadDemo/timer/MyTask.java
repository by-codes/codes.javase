package club.banyuan.threadDemo.timer;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class MyTask extends TimerTask {

  private Timer timer;


  public MyTask(Timer timer) {
    this.timer = timer;
  }

  @Override
  public void run() {

    System.out.println("has哈哈");
    timer.cancel();
  }
}
