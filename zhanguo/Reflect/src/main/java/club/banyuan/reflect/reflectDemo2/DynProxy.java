package club.banyuan.reflect.reflectDemo2;

public class DynProxy {
    //设计模式   代理模式是其中的一种     单例模式             抽象工厂模式   工厂方法模式

  /*
      A    ------>   B    --->  吆喝  ---  c  d  e  f  ....

      现在有一个接口     实现这个接口


      PersonImpl  买车子   问   CarPerson（很了解）


   */
  public static void main(String[] args) {
    Person  p=new PersonImpl();
    CarPerson  carPerson=new CarPerson(p);
    carPerson.buyCar();

    //这种写法叫做静态代理   在执行目标任务之前就已经知道是哪个对象来对目标对象进行代理


  }




}
