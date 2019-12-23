package club.banyuan.jdbc.util3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestC3p0 {
    static Connection  con=null;
    static PreparedStatement ps=null;
    static ResultSet rs=null;
    public static void main(String[] args) throws SQLException {

        Connection  con=Demo7.getCon();

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
