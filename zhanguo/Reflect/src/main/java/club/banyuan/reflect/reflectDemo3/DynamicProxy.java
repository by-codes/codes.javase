package club.banyuan.reflect.reflectDemo3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//这是个代理律师
public class DynamicProxy   implements InvocationHandler {

  //动态代理:在执行目标方法之前才会确定是哪个对其进行代理
  // 确定关系是在运行时
  //jdk  动态代理      cglib  动态代理

  //jdk 动态代理   接口  目标类    一个代理接口   代理Proxy类

  //律师在大官司的时候  只会对接一个案子嘛
  private   Object  object; //目标类   代理类可以代理所有的 对象

  public DynamicProxy(Object lawsuit) {
    this.object = lawsuit;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

    //System.out.println("执行的方法名称..."+method.getName());
    //System.out.println("传递过来的参数:"+args[0]);
    //执行代理目标的方法


    //在执行目标方法之前    数据检索操作
//      for (Object  obj:args){
//        System.out.println(obj);
//      }

    //在执行目标方法之前对目标类提供的线索进行保存
    File file  =new File("xs.txt");
    if(!file.exists()){
      file.createNewFile();
    }
    BufferedWriter  bufferedWriter=new BufferedWriter(new FileWriter(file,true));
    for(int  i=0;i<args.length;i++){
      if(args[i]!=null){
        bufferedWriter.write(args[i]+",");
        bufferedWriter.flush();
      }
    }
    System.out.println("证据已经保存...");
    //在做登录之前进行身份验证

    //执行目标方法
    Object   obj=method.invoke(object,args);

    return obj;
  }




}
