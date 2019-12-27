package club.banyuan.lambda2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Consumer   消费型接口 Supplier   供给型接口 Function   函数型接口 Predicate  断言型接口
 * <p>
 * <p>
 * BiConsumer 是Consumer 升级版 BiFunction 是Function 升级版
 */


public class TestLambdaInterface {

  public static void main(String[] args) {

//    LambdaInterface<String>  lambdaInterface=(str)-> "哈哈啥事"+str;
//
//   // System.out.println(    lambdaInterface.getValue("你好"));
//
//    String   st=show("陈家园",(str)-> "哈哈啥事"+str);
//    System.out.println(st);
//
//    //lambda表达式可以传递一段代码作为数据传输
//
//
//    //java 8  提供的几个函数式接口
//    // 消费型的函数式接口
//    Consumer<String>  con=(str) -> System.out.println("你好啊"+str);
//    con.accept("你好");
//

    //供给型接口
//    List<Integer> list = getList(10, () -> (int) (Math.random() * 100));
//    for (Integer i : list) {
//      System.out.print(i+" ");
//    }

    //

    // 函数型接口
//   Function<String,String>  f=new Function<String,String>(){
//      @Override
//      public String apply(String o) {
//        return o.substring(1);
//      }
//    };
//   f.apply("sadasdadasds");
//
//    String  sss=setHandler("我喜欢大宝剑....",(str)->str.substring(1));
//    System.out.println(sss);

      //断言型接口
        List<String>  list= Arrays.asList("hello","kuGou","网易","腾讯","马大帅");

        //找出集合里面长度 大于2的数据

//    for (String  s:getLength(list, (s)-> s.length()>2)) {
//      System.out.println(s);
//    }
//
    //BiConsumer 函数接口
    Person   A=new Person();
    A.setMoney(100);
    Person   B=new Person();
    B.setMoney(100);

//    BiConsumer<Person,Person>  biConsumer=new BiConsumer<Person, Person>() {
//      @Override
//      public void accept(Person person, Person person2) {
//                  person.setMoney(person.getMoney()+person2.getMoney());
//      }
//    };
    BiConsumer<Person,Person>  biConsumer=(o,o1)->o.setMoney(o.getMoney()+o1.getMoney());
    biConsumer.accept(A,B);
    System.out.println(A.getMoney());
  }

  public   static <T,U>   void   changeMoney(T t,U u,BiConsumer<T,U> biConsumer){
    biConsumer.accept(t,u);
  }
  //断言型接口
  public   static  List<String>  getLength(List<String> list, Predicate<String> predicate){
    List<String>  list1=new ArrayList<>();
    for (String   str:list) {
        boolean   flag=predicate.test(str);
        if(flag){
          list1.add(str);
        }
    }
    return  list1;
  }

  //函数型接口
  public  static   String  setHandler(String str,Function<String,String>  function){
    return   function.apply(str);
  }
  //随机产生指定个数的整数  并存放到集合里面   10   找出100以内的
  public static List<Integer> getList(int num, Supplier<Integer> supplier) {
    List<Integer> list = new ArrayList();
    for (int i = 0; i < num; i++) {
      Integer k = supplier.get(); //核心代码
      list.add(k);
    }
    return list;
  }


  public static String show(String str, LambdaInterface<String> lambdaInterface) {

    return lambdaInterface.getValue(str);

  }


}
