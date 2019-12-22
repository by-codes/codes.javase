package club.banyuan.threadDemo.synchAndLock;

import java.awt.font.TextHitInfo;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockNotWait {
  private Lock lock=new ReentrantLock();

  public  void  lockTes(Thread   thread) throws InterruptedException {

   if(lock.tryLock(3000, TimeUnit.MILLISECONDS)) {  //尝试获取锁
     try {
       System.out.println(thread.getName() + "进来了...获取了当前锁...");

       Thread.sleep(2000);

     } catch (InterruptedException e) {
       e.printStackTrace();
       System.out.println(thread.getName() + "发生了异常,释放了锁...");
     } finally {
       System.out.println(thread.getName() + "正常执行完毕..释放了锁....");
       lock.unlock();//主动释放锁
     }
   }else{
     System.out.println(thread.getName()+"没有获取到锁...被其他线程占用了....");
   }
  }



  }
