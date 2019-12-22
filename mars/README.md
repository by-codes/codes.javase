快捷方式：
cd ~/projs/mars
javac -cp ./src src/com/banyuan/mars/App.java -d target && java -cp target com.banyuan.mars.App

## 1. 组织自己的代码

1. 编译源代码为class文件，与源文件同目录
java [-cp <源代码包名根目录>]<源代码文件路径>
javac -cp ~/projs/mars/src ~/projs/mars/src/com/banyuan/mars/App.java

2. 编译源代码为class文件到指定目录 -d 参数
javac <源代码文件路径> [-d <目标目录>]
javac ~/projs/mars/src/com/banyuan/mars/App.java -d ~/projs/mars/target

3. 运行代码：-cp 包搜索路径的根目录
java [-cp <类所在包的根目录>] <类全名>
java -cp ~/projs/mars/target com.banyuan.mars.App

## 分发自己的代码
1 打包成jar
jar -cf ~/projs/mars/app.jar -C target/ .

2. 运行jar包中的main方法
java -cp ~/projs/mars/app.jar com.banyuan.mars.App

3. 更方便地运行.jar中的main方法
jar -cfe ~/projs/mars/app.jar com.banyuan.mars.App -C target/ .
java -jar ~/projs/mars/app.jar 

4. 查看jar文件中的内容目录
jar -tf ~/projs/mars/app.jar 

## 引用第三方代码库

### 引用JDK里(XML Parser)
### 引用第三方代码库(CSV Parser)

5. 分发完整的代码 

javadoc com.banyuan.mars.library -d ../docs


关于bootclasspath
https://www.cnblogs.com/adolfmc/archive/2012/10/07/2713562.html