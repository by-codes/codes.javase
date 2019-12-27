package club.banyuan.annotation;

public @interface MyAnnotation2 {


  String[] value();

  String  con()   default   "半圆";

}
