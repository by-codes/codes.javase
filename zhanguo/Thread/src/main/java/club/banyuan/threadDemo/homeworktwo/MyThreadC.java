package club.banyuan.threadDemo.homeworktwo;

public class MyThreadC extends  Thread{

  Tool  tool;
  public MyThreadC(Tool  tool){
    this.tool=tool;
  }

  @Override
  public void run() {
  while (true) {
    synchronized (tool) {
      if (tool.i == 2) {
        tool.notify();
        System.out.println(Thread.currentThread().getName() + "---");
        tool.i = 0;
//        try {
//          tool.wait();
//        } catch (InterruptedException e) {
//          e.printStackTrace();
//        }
      }
    }
  }
  }

}
