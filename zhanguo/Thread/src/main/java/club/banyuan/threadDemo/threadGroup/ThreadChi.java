package club.banyuan.threadDemo.threadGroup;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadChi {

  public static void main(String[] args) throws ExecutionException, InterruptedException {


    //不是线程池里面的 线程月多越好

    //创建线程池
    ExecutorService   es=Executors.newCachedThreadPool();
    MyCallable  myCallable=new MyCallable();

    Future  future=es.submit(myCallable);
    es.shutdown();

    System.out.println(future.get());
    /*
        Callable和 Runnable 区别


     */


//
//    MyThread  myThread1=new MyThread();
//    MyThread  myThread2=new MyThread();
//    MyThread  myThread3=new MyThread();
//    MyThread  myThread4=new MyThread();
//    MyThread  myThread5=new MyThread();
//    MyThread  myThread6=new MyThread();
//    MyThread  myThread7=new MyThread();
//    MyThread  myThread8=new MyThread();
//    MyThread  myThread9=new MyThread();
//    MyThread  myThread10=new MyThread();
//    MyThread  myThread11=new MyThread();
//    MyThread  myThread12=new MyThread();
//    MyThread  myThread13=new MyThread();
//
//    es.submit(myThread1);
//    es.submit(myThread2);
//    es.submit(myThread3);
//    es.submit(myThread4);
//    es.submit(myThread5);
//    es.submit(myThread6);
//    es.submit(myThread7);
//    es.submit(myThread8);
//    es.submit(myThread9);
//    es.submit(myThread10);
//    es.submit(myThread11);
//    es.submit(myThread12);
//    es.submit(myThread13);
//
//    es.shutdown();

//    MyThread  myThread1=new MyThread();
//    System.out.println(System.currentTimeMillis());
//    //每个线程要消耗1MB内存  开线程的数量  最好跟电脑的核数有关       9  --->>>19     10 --->>>21
//    for (int i = 0; i <100000; i++) {
//      Thread  t=new Thread(myThread1);
//      t.start();
//    }
//    System.out.println(System.currentTimeMillis());
//

  }

}
