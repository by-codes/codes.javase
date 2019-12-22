package club.banyuan.threadDemo.homeworkthree;

public class Test {

  /*
    有四个线程,其中A,B线程对i加1操作，C,D线程每次对i减1操作
   */

  public static void main(String[] args) {

    Tool  tool=new Tool();
    AddThread  addThread1=new AddThread("线程A", tool);
    AddThread  addThread2=new AddThread("线程B", tool);
    DelThread  delThread3=new DelThread("线程C", tool);
    DelThread  delThread4=new DelThread("线程D", tool);

    addThread1.start();
    addThread2.start();
    delThread3.start();
    delThread4.start();


  }



}
