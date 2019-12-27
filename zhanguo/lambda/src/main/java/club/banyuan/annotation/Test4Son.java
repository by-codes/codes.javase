package club.banyuan.annotation;

import java.lang.reflect.Method;

public class Test4Son   extends   Test4{


  public static void main(String[] args) {

    try {
      Method m=Test4Son.class.getMethod("show" );
    boolean flag=  m.isAnnotationPresent(MyAnnotation4.class);
      if(flag){
        MyAnnotation4 myAnnotation4=m.getAnnotation(MyAnnotation4.class);

        System.out.println(myAnnotation4.name());

      }


    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    }


  }

}
