package club.banyuan.threadDemo.threadOne;



public class ThreadDemo {

  /**
   * 什么是多线程？ 迅雷下载  x    QQ
   *
   * 进程:正在运行的程序  是系统进行资源分配与调用  一个独立单位
   * 每一个进程都有自己的内存空间和系统资源
   *
   *什么是线程？   是进程中单个顺序控制流   是一条执行路径
   *  如果一个进程只有一个执行路径   叫单线程程序
   *  如果一个进行有多条执行路径 则称为多线程程序
   *
   *多线程特点: 永远是抢占资源    永远是随机的
   *
   *  编程     并发编程      菜市场  200  8:00       50(10)
   *         也叫多线程编程
   *
   *  jvm 虚拟机的启动时单线程还是多线程的?
   *  main  一个线程在执行
   * 存在垃圾回收 一个线程在执行
   *
   * 如何实现多线程？
   *  1.继承Thread     2.实现Runnale接口    3.Callable     4.
   *
   *
   *
   *
   */

  public static void main(String[] args) {

    new Object();
    new Object();
    new Object();


  }


}
