package club.banyuan.threadDemo.threadSignaling;

import java.util.Set;

public class Test {

  public static void main(String[] args) {
    //只生产一个月饼对象
    MoonCake  moonCake=new MoonCake();
    SetMoonCake  setMoonCake=new SetMoonCake(moonCake);
    GetMoonCake  getMoonCake=new GetMoonCake(moonCake);

    setMoonCake.start();
    getMoonCake.start();
  }
}
