package club.banyuan.threadDemo.homework;

public class Demo {

  /*
    现在有一个旅行队10个人,探险进入一线天,
    这个一线天每次只能过一个人,每个人过的时间是20秒,
    现在10个人通过该一线天,请输出每个人经过一线天的顺序和姓名
   */
  public static void main(String[] args) {

    PersonThread  personThread=new PersonThread();

    Thread  t1=new Thread(personThread,"A");
    Thread  t2=new Thread(personThread,"B");
    Thread  t3=new Thread(personThread,"C");
    Thread  t4=new Thread(personThread,"D");
    Thread  t5=new Thread(personThread,"E");

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();


  }

}
