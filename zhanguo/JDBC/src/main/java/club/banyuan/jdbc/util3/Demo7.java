package club.banyuan.jdbc.util3;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Demo7 {

    /*
       c3p0
     */

   private  static ComboPooledDataSource dataSource=new ComboPooledDataSource("c3p0-config.xml");


   public  static Connection   getCon() throws SQLException {

       return   dataSource.getConnection();
   }


}
