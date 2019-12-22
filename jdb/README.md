## 1.编译java代码
javac -g -d bin src/HelloJDB.java

## 2.使用jdb调试java代码
jdb -classpath .:./bin HelloJDB

## 3.在main方法开始处设置端点
stop in HelloJDB.main

## 4.run命令运行HelloJDB.class

## 5.locals查看变量

## 6.step命令运行下一行代码

## 7.可以使用print i查看i变量的值

## 8.使用list命令查看代码运行到什么位置

## 9.可以使用next命令运行代码，但是在执行有方法调用的语句时，next会执行完代码，step进入方法体

## 10.运行step up把方法执行完，返回调用处

## 11.通过stop at HelloJDB:14在14行设置断点

## 12.然后执行cont把循环执行完。cont功能是运行到下个断点处停止

## 13.使用quit或exit退出JDB
