package club.banyuan.threadDemo.homeworktwo;

public class MyThreadB extends  Thread{

  Tool  tool;
  public MyThreadB(Tool  tool){
    this.tool=tool;
  }

  @Override
  public void run() {
  while (true) {
    synchronized (tool) {
      if (tool.i == 1) {
        tool.notify();
        System.out.println(Thread.currentThread().getName() + "---");
        tool.i = 2;
      }
//        try {
//          tool.wait();
//        } catch (InterruptedException e) {
//          e.printStackTrace();
//        }
      }
    }
  }


}
