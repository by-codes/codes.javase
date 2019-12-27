package club.banyuan.annotation;

/*
  自定义注解

 */

public @interface MyAnnotation1 {

    /*
        默认的就是继承了  java.lang.annotation.Annotation

        一个注解可以放在类的任何一个地方

     */
    String  name();

    String  address();

    int  age();


}
