package club.banyuan.jdbcutil.testConnectionPool;

import club.banyuan.jdbc02.pojo.Admin;
import club.banyuan.jdbcutil.c3p0.C3p0Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Tool {

  static PreparedStatement ps = null;

  //不使用连接池的情况下 插入数据
  public static void writeAdminUnUseConPool(Admin admin) {

    String sql = "insert  into admin(username,password,money)values(?,?,?)";
    try {
      ps = DBUtil.getConnection().prepareStatement(sql);
      ps.setString(1, admin.getUsername());
      ps.setString(2, admin.getPassword());
      ps.setDouble(3, admin.getMoney());
      ps.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      DBUtil.closeCon();
    }
  }
  //使用连接池技术

  public static void writeAdminByUseConPool(Admin admin, Connection con) {
    String sql = "insert  into admin(username,password,money)values(?,?,?)";
    try {
      ps = con.prepareStatement(sql);
      ps.setString(1, admin.getUsername());
      ps.setString(2, admin.getPassword());
      ps.setDouble(3, admin.getMoney());
      ps.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace();
    }


  }


}
