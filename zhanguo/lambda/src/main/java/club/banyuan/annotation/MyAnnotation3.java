package club.banyuan.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

@Documented
public @interface MyAnnotation3 {

  /*
    元注解: 专门用来注解  自定义注解的
      @target
          用于描述注解的使用范围
      ElementType.xxx

      @Retention
        用于描述注解的生命周期

      @Documented
         用于生一个javadoc文档   方便阅读

      @Inherited
          用于表示某个标注 是被继承的
          如果一个使用了  @Inherited修饰了 annotation 类型  被用于一个class文件
          则这个 annotation 将被用于该类的子类
   */

    String   name()  default "张三";
    String   hello();



}
