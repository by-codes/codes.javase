###  什么是反射机制？在运行状态中 对于任意的一个类(class文件) 都能够知道这个类的属性和方法
###  对于任意一个对象 都能够调用其任意一个方法和属性  
###  这种动态获取信息以及动态获取对象的方法的功能称之为 反射  

####  比如: 写好了的小程序  tomcat  现在  用户 往里面添加一个额外的功能
####    new  对象     一般情况下 一款应用软件如果想要扩展功能  前期在设计的时候会提供一个对外接口

###  现在已经有了对外接口 （往指定的程序里面添加额外功能  首先得找到这个具体的一个class文件） 如何去读取这个class文件
###  java 有一个默认的读取class文件的一个功能

###  对外接口有了  class文件也有了  现在就是在没有源码的情况 不改变已有的代码情况下  增加额外功能
###  这时候要使用反射技术   new  对象  调用方法  全部都给你自动完成

##  以上就是反射技术: 就是能够动态的调用类的信息及其成员

### 1.提高了扩展性   2.开发人员体验好



