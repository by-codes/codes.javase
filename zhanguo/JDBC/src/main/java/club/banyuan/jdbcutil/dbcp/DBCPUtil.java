package club.banyuan.jdbcutil.dbcp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;
import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

public class DBCPUtil {

  public  static Connection  con=null;

  static {

    Properties  properties=new Properties();
    try {
      InputStream  is=DBCPUtil.class.getClassLoader().getResourceAsStream("db.properties");
      properties.load(is); //字节流   读取文件的字节流
      //无需把配置文件里面的数据读取出来
      BasicDataSource bas= BasicDataSourceFactory.createDataSource(properties);
      con=bas.getConnection();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }




}
