package club.banyuan.threadDemo.homeworktwo;

public class MyThreadD  extends  Thread {

  Tool  tool;
  public   MyThreadD(Tool  tool){
    this.tool=tool;
  }

  @Override
  public void run() {
      while (true){
        synchronized (tool){
          tool.notifyAll();
        }
      }
  }
}
