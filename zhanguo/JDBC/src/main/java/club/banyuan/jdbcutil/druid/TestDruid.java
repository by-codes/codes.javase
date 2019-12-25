package club.banyuan.jdbcutil.druid;

import club.banyuan.jdbcutil.c3p0.C3p0Util;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDruid {

  static PreparedStatement  ps=null;
  static ResultSet  rs=null;
  public static void main(String[] args) {
    String  sql="select *from  admin where username='lyt'";

    try {
      ps=DruidUtil.getCon().prepareStatement(sql);
      rs=ps.executeQuery();
      if(rs.next()){
        System.out.println(rs.getInt(1)+"--"+rs.getString(2));
      }

    } catch (SQLException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }


  }


}
