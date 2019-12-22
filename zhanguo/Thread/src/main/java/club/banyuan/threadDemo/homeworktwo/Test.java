package club.banyuan.threadDemo.homeworktwo;

import club.banyuan.threadDemo.dieLock.MyThread;
import club.banyuan.threadDemo.threadGroup.MyCallable;

public class Test {

  /*
      1.现在有三个线程,如何保持三个线程按照顺序执行
   */

  public static void main(String[] args) {
    // A   B   C
    Tool  tool =new  Tool();
    MyThreadA  myThreadA=new MyThreadA(tool);
    MyThreadB  myThreadB=new MyThreadB(tool);
    MyThreadC  myThreadC=new MyThreadC(tool);
    MyThreadD  myThreadD=new MyThreadD(tool);
    myThreadA.start();
    myThreadB.start();
    myThreadC.start();

    try {
      Thread.sleep(300);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    myThreadD.start();

  }
}
