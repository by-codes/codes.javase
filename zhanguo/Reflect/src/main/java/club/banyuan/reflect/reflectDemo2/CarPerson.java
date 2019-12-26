package club.banyuan.reflect.reflectDemo2;

//  代理类
public class CarPerson   implements Person {

  private   Person  p; //目标类
  private   int  money=5000;

  public CarPerson(Person p) {
    this.p = p;
  }

  @Override
  public void buyCar() {
    //对于  PersonImpl  对象  要买车之前进行一系列分析    我爸       我
    if(money>160000){
      //分析完了之后  我再买车  （执行目标对象的买车方法）
      p.buyCar();
      System.out.println("有钱人....");
    }
    System.out.println("钱太少了...");


  }



}
