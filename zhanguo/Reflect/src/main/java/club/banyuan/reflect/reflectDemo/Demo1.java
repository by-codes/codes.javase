package club.banyuan.reflect.reflectDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo1 {


  public static void main(String[] args) {
    //找到一个class文件
    //Object   getClass方法
    Person person = new Person();
    Class clazz = person.getClass();  //1.获取class文件

    Class<Person> clazz1 = Person.class; //2.获取class文件
    System.out.println(clazz == clazz1);

    //为了具体化一个class文件所在的位置

    try {
      //第三种获取class文件的方式
      Class clazz2 = Class.forName("club.banyuan.reflect.reflectDemo.Person"); //具体的类所在的目录
      //  System.out.println(clazz2);
      //获取到class文件
      Object obj = clazz2.newInstance();// 返回一个class文件的实例对象

      //  System.out.println(obj);
      Field f = clazz2.getDeclaredField("name");
      // System.out.println(f);

      f.setAccessible(true);//暴力访问 如果是私有化的属性 可以设置暴力访问
      f.set(obj, "城家园");  //给某个对象设置值
      Object o = f.get(obj);
      System.out.println("-----" + o);

      Field[] fields = clazz2.getDeclaredFields();  //获取class文件所有的 属性
      for (Field fe : fields) {
        System.out.println(fe);
      }
      System.out.println("---------------->>>>>>>>>>>>>>>>>>");

      Method m = clazz2.getDeclaredMethod("show2", String.class, int.class);
      m.setAccessible(true);
      m.invoke(obj, "小吴", 25);  //表示执行目标方法

      Method[] methods = clazz2.getDeclaredMethods();
      for (Method method : methods) {
        System.out.println(method);
      }
      System.out.println("以下是构造器...........");

      Constructor con = clazz2.getConstructor();  //无参构造器
      // Object  ob=con.newInstance(); //通过无参构造器创建对象

      con = clazz2.getConstructor(String.class, String.class);
      Object ob = con.newInstance("小六子", "下水道西");

      Method me = clazz2.getDeclaredMethod("show3");
      Object object = me.invoke(ob, null);
      System.out.println("----" + object); //叫执行目标方法的 并且得到其返回值


    } catch (Exception e) {
      e.printStackTrace();
    }


  }


}
