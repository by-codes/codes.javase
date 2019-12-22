package club.banyuan.threadDemo.homeworktwo;

public class MyThreadA extends  Thread{

  Tool  tool;
  public MyThreadA(Tool  tool){
    this.tool=tool;
  }


  @Override
  public void run() {
  while (true) {
    synchronized (tool) {
      if (tool.i == 0) {
        tool.notify();
        System.out.println(Thread.currentThread().getName() + "---");
        tool.i = 1;

      }
    }
  }
  }

}
