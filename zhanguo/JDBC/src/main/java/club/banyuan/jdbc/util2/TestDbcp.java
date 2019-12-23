package club.banyuan.jdbc.util2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDbcp {

   static Connection  con=null;
    static PreparedStatement ps=null;
    static ResultSet rs=null;
    public static void main(String[] args) throws SQLException {


      con=Demo6.getConnection();
      String  sql="select *from  admin";
       ps= con.prepareStatement(sql);

      rs= ps.executeQuery();

        while(rs.next()){
            System.out.println(rs.getString(2)+"====="+rs.getString(3));
        }
        rs.close();
        ps.clearParameters();
        con.close();

    }

}
