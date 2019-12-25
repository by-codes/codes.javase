package club.banyuan.jdbcutil.testConnectionPool;

import club.banyuan.jdbc02.pojo.Admin;
import club.banyuan.jdbcutil.c3p0.C3p0Util;
import club.banyuan.jdbcutil.dbcp.DBCPUtil;
import club.banyuan.jdbcutil.druid.DruidUtil;
import java.sql.Connection;
import java.sql.SQLException;

public class Test {



  public static void main(String[] args) {
    Connection  con=null;
    try {
     //con= C3p0Util.getConn();  // //使用c3p0连接池  过去了:16950毫秒    16673毫秒  并不是连接数越多越好19333毫秒
     //con= DBCPUtil.con;   //    dbcp  过去了:12913毫秒
      con= DruidUtil.getCon();  //  过去了:9185毫秒

    } catch (Exception e) {
      e.printStackTrace();
    }

    long  start= System.currentTimeMillis();

    for (int i = 0; i <10000; i++) {
     Admin admin=new Admin("剑圣"+i,"45"+i,34.0+i);
      //Tool.writeAdminUnUseConPool(admin);
      Tool.writeAdminByUseConPool(admin,con);
    }

    long  end = System.currentTimeMillis();
    System.out.println("过去了:"+(end-start)+"毫秒"); //44303毫秒
  }
}
