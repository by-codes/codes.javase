##  ODBC   C语言操作数据的技术
##  JDBC   是java语言操作数据库的技术
java   Database Connectivity
A             B            C              D

                jdbc API 

mysql       oracle       sqlServer       DB2  

java 与数据库的连接
jdbc  API 里面的方法:连接数据库的方法
1.加载驱动   Class.forName()
2.使用管理工具获取连接   
3.创建Statement对象
4.处理sql语句
5.关闭数据库连接

### jdbc     分层思想         mvc       m  model      v  view       c controller
### 比如说:如果专门是用来对数据库的操作(处理sql语句) --->>>  要有重用性   数据处理层
### 每个项目的功能都不同   一些业务逻辑      业务层
### 把数据展示在终端(网站  app  桌面应用)    视图层
### 前后端交互    中间方 用来做中转操作       控制层         

pojo     存放一些公共的实体类
dao      对数据库操作的一些接口
service  业务逻辑存在的位置
controller 用于跟前端进行交互
util     专门用来对数据库进行连接的工具类


###  DBCP连接工具      C3p0连接工具     Druid连接工具  
 
### springboot2.0    Hikaricp 连接工具

### jdbc连接池: 连接池里面有多个连接   过一段时间自动销毁     

###  不适用连接池和使用连接池区别

### proxool  2008 速度可以 稳定性有点差  并发高的情况下会出错
### C3p0  代码比较复杂 不利于维护   c3p0处理高并发比较差
### dbcp  tomcat服务器组件 对于高并发处理还行
### druid  号称 目前综合性功能最强  sql拦截功能   
### Hikaricp 目前被springboot 官方推荐使用的连接池
 
###   分页    多条件查询  and     多条件模糊查询    条件1  or  条件2  or....


