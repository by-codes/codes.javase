package club.banyuan.reflect.reflectDemo3;

import club.banyuan.reflect.reflectDemo2.Person;
import java.lang.reflect.Proxy;

public class Test {

  public static void main(String[] args) {

    Lawsuit  lawsuit=new PersonAImplLawsuit();  //李四大官司  目标类
    DynamicProxy  dynamicProxy=new DynamicProxy(lawsuit);//代理类

    //使用jdk提供的 Proxy 去执行代理类
    Lawsuit ob= (Lawsuit)Proxy.newProxyInstance(lawsuit.getClass().getClassLoader(),lawsuit.getClass().getInterfaces(),dynamicProxy);

    ob.submit("无良老板钱钱跑路");

    ob.defend();


    //cglib 动态代理   上传到git 明天检查    找出  jdk 动态代理和  cglib 动态代理的不同



  }

}
