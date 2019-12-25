package club.banyuan.jdbcutil.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;

public class C3p0Util {

  public static    Connection conn=null;

  static ComboPooledDataSource com=new ComboPooledDataSource("c3p0-config.xml");

  public  static  Connection  getConn() throws SQLException {
    System.out.println(com.getDriverClass());
    System.out.println(com.getJdbcUrl());
//    return null;
    return   com.getConnection();
  }

}
