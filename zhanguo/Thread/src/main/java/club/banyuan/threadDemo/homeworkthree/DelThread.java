package club.banyuan.threadDemo.homeworkthree;

import java.util.concurrent.CountDownLatch;

public class DelThread extends Thread {

  Tool tool;

  public DelThread(String name, Tool tool) {
    super(name);
    this.tool = tool;
  }

  @Override
  public void run() {
    while (true) {
      synchronized (tool) {
        if (!tool.flag) {
          if (tool.countDownLatch.getCount() > 0) {
            tool.del();
            tool.countDownLatch.countDown();
            try {
              Thread.sleep((int)(Math.random()*1000)+1);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }

          } else {
            try {
              tool.flag=!tool.flag;
              tool.countDownLatch.await();
              tool.countDownLatch = new CountDownLatch(2);

            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
        }
        }
      }
    }

  }
