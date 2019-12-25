package club.banyuan.jdbcutil.dbcp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDBCP {

  static PreparedStatement  ps=null;
  static ResultSet  rs=null;
  public static void main(String[] args) throws SQLException {
    String  sql="select *from  admin where username='lyt'";

    try {
      ps=DBCPUtil.con.prepareStatement(sql);
      rs=ps.executeQuery();
      if(rs.next()){
        System.out.println(rs.getInt(1)+"--"+rs.getString(2));
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }finally {
      DBCPUtil.con.close();
    }


  }


}
