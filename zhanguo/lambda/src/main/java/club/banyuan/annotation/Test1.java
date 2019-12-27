package club.banyuan.annotation;


@MyAnnotation1(address ="街边",name = "张三", age =34)
public class Test1 {

  @MyAnnotation1(address = "半圆",name = "老吴",age=45)
  private    String   pass;

  @MyAnnotation1(address = "半圆",name = "老吴",age=45)
  public static void main(String[] args) {

  }


}
