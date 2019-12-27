package club.banyuan.annotation;

import java.lang.reflect.Method;

//@MyAnnotation3
public class Test3 {


  //@MyAnnotation3
  public static void main(String[] args) {
      //拿到注解里面的 属性值
    try {
      Method method=Method3.class.getMethod("show" );  //获取类里面指定的方法
     if(method.isAnnotationPresent(MyAnnotation3.class)){// 表示 show 上面有没有使用 MyAnnotation3 注解
       MyAnnotation3  myAnnotation3=method.getAnnotation(MyAnnotation3.class); //获取的是目标注解
       System.out.println(myAnnotation3.hello()+","+myAnnotation3.name());
     }


    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    }


  }


}
