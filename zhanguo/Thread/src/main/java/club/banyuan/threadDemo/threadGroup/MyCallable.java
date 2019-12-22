package club.banyuan.threadDemo.threadGroup;

import java.util.concurrent.Callable;

public class MyCallable  implements Callable {

  @Override
  public Object call() throws Exception {

    System.out.println(Thread.currentThread().getName()+"进入....");

    return "哈哈哈";
  }
}
