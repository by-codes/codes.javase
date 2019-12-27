package club.banyuan.lambda2;

@FunctionalInterface  //在接口上加此注解 表示检查此接口是不是函数式接口
public interface LambdaInterface<T> {

  /*
    函数式接口: 接口里面只包含一个抽象方法    称为函数式接口
   */
      T  getValue(T  t);


}
