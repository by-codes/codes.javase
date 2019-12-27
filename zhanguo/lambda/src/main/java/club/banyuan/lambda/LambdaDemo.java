package club.banyuan.lambda;

import java.util.Comparator;
import java.util.TreeSet;

public class LambdaDemo {

  public static void main(String[] args) {
    Runnable runnable=new  Runnable(){
        @Override
        public void run() {
          System.out.println("我是run....");
        }
      };
    runnable.run();

    //lambda
    Runnable  runnable1= ()-> System.out.println("我是run....");
    runnable1.run();

    TreeSet<String>  ts=new TreeSet<>(new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
      }
    });

    //lambda
    ts=new  TreeSet<>((o1,o2) ->Integer.compare(o1.length(), o2.length()));
    // lambda 表达式  参数不需要指定类型    编译器会根据程序上下文进行判断
    LambdaInterface  lambdaDemo= (str) -> System.out.println("哈撒给...."+str);
    lambdaDemo.show("我贼喜欢大保健");


    /*
        ->  箭头符   左边是表达式所需要的参数    右边是要执行 功能

        大部分的lambda 需要 函数式接口 的支持

        其实就是一个匿名函数    可以   理解为一段可以传递的代码(代码像数据一样进行传递)


     */


  }

}
