package club.banyuan.threadDemo.homeworkthree;

import java.util.concurrent.CountDownLatch;

public class AddThread extends   Thread{

  Tool   tool;

  public AddThread(String name,Tool  tool) {
    super(name);
    this.tool=tool;
  }

  @Override
  public void run() {
        while (true) {
          synchronized (tool) {
            if (tool.flag) {
              if (tool.countDownLatch.getCount() > 0) {
                tool.add();
                tool.countDownLatch.countDown();//线程统计器减少一个
                try {
                  Thread.sleep((int)(Math.random()*1000)+1);
                } catch (InterruptedException e) {
                  e.printStackTrace();
                }
              } else {
                try {
                  tool.countDownLatch.await();
                  tool.countDownLatch = new CountDownLatch(2);
                  tool.flag=!tool.flag;
                } catch (InterruptedException e) {
                  e.printStackTrace();
                }

              }
            }
          }
        }
  }

}
