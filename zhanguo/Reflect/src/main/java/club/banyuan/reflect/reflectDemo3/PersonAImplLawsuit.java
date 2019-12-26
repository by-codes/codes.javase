package club.banyuan.reflect.reflectDemo3;

public class PersonAImplLawsuit implements  Lawsuit {



  @Override
  public void submit(String str) {
    System.out.println("张三提交了以下证据:"+str);
  }

  @Override
  public void defend() {
    System.out.println("张三在法庭进行辩护....");
  }
}
