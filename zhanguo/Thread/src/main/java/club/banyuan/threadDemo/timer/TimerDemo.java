package club.banyuan.threadDemo.timer;

import java.util.Timer;

public class TimerDemo {

  public static void main(String[] args) {
    //定时器
    Timer  timer=new Timer();

    timer.schedule(new MyTask(timer), 4000);


  }
}
