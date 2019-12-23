package club.banyuan.jdbc.util;

import club.banyuan.jdbc.pojo.Admin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Jdbc01 {

  static List list = new ArrayList<>();

  public static void main(String[] args) {
    Connection con = null;
    try {
      //1.加载驱动 mysql(首先加入jar 包)
      Class.forName("com.mysql.jdbc.Driver");
      //2.使用驱动管理工具 获取连接  url 数据库的地址+数据库名  user 数据库名   password数据库密码
      String url = "jdbc:mysql://localhost:3306/jian?useSSL=false";
      con = DriverManager.getConnection(url, "root", "zhou");

      Statement statement = con.createStatement();//专门对sql进行处理的
      statement.setMaxRows(3); //
      String sql = "select *from  admin ";
      ResultSet resultSet = statement.executeQuery(sql);//获取处理之后的结果集
      //System.out.println(resultSet.next());
      while(resultSet.next()){
          Admin admin=new  Admin();
          admin.setAid(resultSet.getInt(1));
          admin.setUsername(resultSet.getString(2));
          admin.setPassword(resultSet.getString(3));
          list.add(admin);
      }

      for (Object  b:list) {
        Admin  a=(Admin)b;
        System.out.println(a.toString());
      }

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (con != null) {
        try {
          con.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }


  }

}
