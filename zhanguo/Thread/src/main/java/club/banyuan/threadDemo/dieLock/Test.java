package club.banyuan.threadDemo.dieLock;

public class Test {

  public static void main(String[] args) {
    MyThread  myThread1=new MyThread("张三",true);

    MyThread  myThread2=new MyThread("李四",false);

    myThread1.start();
    myThread2.start();
  }


}
