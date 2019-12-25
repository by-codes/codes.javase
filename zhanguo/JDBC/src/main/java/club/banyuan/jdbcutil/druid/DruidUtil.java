package club.banyuan.jdbcutil.druid;

import club.banyuan.jdbcutil.dbcp.DBCPUtil;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class DruidUtil {

  static Properties properties = new Properties();
  static {
    InputStream is = DBCPUtil.class.getClassLoader().getResourceAsStream("druid.properties");
    try {
      properties.load(is);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static Connection getCon() throws Exception {

    return DruidDataSourceFactory.createDataSource(properties).getConnection();
  }


}
