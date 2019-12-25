package club.banyuan.jdbcutil.c3p0;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestC3p0 {

  static PreparedStatement  ps=null;
  static ResultSet  rs=null;
  public static void main(String[] args) throws SQLException {
    String  sql="select *from  admin where username='lyt'";

    try {
      ps=C3p0Util.getConn().prepareStatement(sql);
      rs=ps.executeQuery();
      if(rs.next()){
        System.out.println(rs.getInt(1)+"--"+rs.getString(2));
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }finally {
      C3p0Util.getConn().close();
    }
  }
}
