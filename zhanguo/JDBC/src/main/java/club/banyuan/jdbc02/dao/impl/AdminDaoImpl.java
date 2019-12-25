package club.banyuan.jdbc02.dao.impl;

import club.banyuan.jdbc02.pojo.Admin;
import club.banyuan.jdbc02.dao.AdminDao;
import club.banyuan.jdbc02.util.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AdminDaoImpl implements AdminDao {

  //对数据库操作的类
  Connection con = null;
  PreparedStatement ps = null;
  ResultSet rs = null;

  @Override
  public void insertAdmin(Admin admin) {
    // String sql = "insert  into admin (username,password)values(?,?)";
    String sql = "{call insertAdmin(?,?,?)}";
    try {
      con = DBUtil.getConnection();
      ps = con.prepareStatement(sql);
      ps.setString(1, admin.getUsername());
      ps.setString(2, admin.getPassword());
      ps.setDouble(3, admin.getMoney());
      int result = ps.executeUpdate();
      if (result > 0) {
        System.out.println("插入成功");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      DBUtil.closeCon();
    }
  }

  @Override
  public void delByName(String name) {

    String sql = "delete from admin  where  username=?";
    con = DBUtil.getConnection();
    try {
      ps = con.prepareStatement(sql);
      ps.setString(1, name);
      int result = ps.executeUpdate();
      if (result > 0) {
        System.out.println("删除成功...");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public List getBySingleStr(String singleName) {
    return null;
  }

  @Override
  public Admin getByName(String name) {
    String sql = "select *from  admin where  username=?";
    con = DBUtil.getConnection();
    Admin admin = null;
    try {
      ps = con.prepareStatement(sql);
      ps.setString(1, name);
      rs = ps.executeQuery();
      if (rs.next()) {
        //admin=new Admin(rs.getInt(1),rs.getString(2),rs.getString(3));
        admin = new Admin();
        admin.setAid(rs.getInt("id"));
        admin.setUsername(rs.getString("username"));
        admin.setPassword(rs.getString("password"));
        return admin;
      }


    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      DBUtil.closeCon();
    }

    return null;
  }

  @Override
  public void updateMoney(String uName, Double money) {

    String sql = "update   admin  set money=money+? where username=?";
    con = DBUtil.conn;
    try {
      ps = con.prepareStatement(sql);
      ps.setDouble(1, money);
      ps.setString(2, uName);
      int result = ps.executeUpdate();
      if (result > 0) {
        System.out.println("给" + uName + "转账成功...");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  //批量处理    一次性增加多少个   或者一次性删除多少个  或者一次性修改多少个数据
  @Override
  public void insertAdmin(List list) {
    String sql = "{call insertAdmin(?,?,?)}";
    try {
      con = DBUtil.getConnection();
      ps = con.prepareStatement(sql);
      for (Object obj : list) {
        Admin admin = (Admin) obj;
        ps.setString(1, admin.getUsername());
        ps.setString(2, admin.getPassword());
        ps.setDouble(3, admin.getMoney());
        ps.addBatch(); //用来把处理的数据一个个进行预处理
      }
      int[] result = ps.executeBatch();
      if (result.length > 0) {
        System.out.println("插入成功" + result.length);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      DBUtil.closeCon();
    }
  }
  //显示出前五条带有 '张' 字的数据

  //作业：批量删除


}