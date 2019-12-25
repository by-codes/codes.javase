package club.banyuan.jdbc02.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

  public static  Connection conn=null;

   static {
     conn=getConnection();
   }

    public  static Connection  getConnection(){
        String  url="jdbc:mysql://localhost:3306/jian?useSSL=false";
        String  driver="com.mysql.jdbc.Driver";
        String  username="root";
        String  password="zhou";
        try {
            Class.forName(driver);
            try {
                conn= DriverManager.getConnection(url, username,password);
                return conn;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
       return null;
    }

    public   static  void  closeCon(){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
