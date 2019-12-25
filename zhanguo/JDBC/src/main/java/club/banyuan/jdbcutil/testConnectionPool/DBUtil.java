package club.banyuan.jdbcutil.testConnectionPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

   static  Connection con=null;
    public  static Connection  getConnection(){
        String  url="jdbc:mysql://localhost:3306/jian?useSSL=false";
        String  driver="com.mysql.jdbc.Driver";
        String  username="root";
        String  password="zhou";
        try {
            Class.forName(driver);
            try {
                con= DriverManager.getConnection(url, username,password);
              System.out.println("数据库连接成功...");
                return con;
            } catch (SQLException e) {
                e.printStackTrace();
              System.out.println("数据库连接失败...");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
       return null;
    }

    public   static  void  closeCon(){
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
