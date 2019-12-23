package club.banyuan.jdbc.util;

import java.sql.Statement;
import java.util.Scanner;
import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo5 {

  // 作业:如何把 对数据库操作的 api对象也提取 到一个工具类里面去
  static PreparedStatement ps = null;
  static ResultSet rs = null;

  public static void main(String[] args) {
    Connection con = DBUtil.getConnection();
//        String  name="lyt";
//        String  password="'666' or '1=1'";
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    String password = sc.next();

//    String sql =
//        "select *from  admin where username ='" + name + "' and password ='" + password + "'";
  //  System.out.println(sql);

    try {
      /*
          PreparedStatement  对sql语句进行了预处理 可以防止sql注入问题
          Statement
       */
       ps= con.prepareStatement("select *from  admin where  username=? and password=?");
       ps.setString(1, name);
       ps.setString(2, password);
      rs=ps.executeQuery();
//      Statement statement = con.createStatement();
//      rs = statement.executeQuery(sql);
      if (rs.next()) {
        System.out.println("欢迎登录" + rs.getString(2) + "," + rs.getString(3));
      }

//           while(rs.next()){
//               System.out.println(rs.getString(2)+"====="+rs.getString(3));
//           }
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

}
