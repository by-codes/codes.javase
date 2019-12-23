package club.banyuan.jdbc.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCUpdate {

  public static void main(String[] args) {
    Connection con = DBUtil.getConnection();
//    Scanner sc = new Scanner(System.in);
//    System.out.println("请输入名字:");
//    String name = sc.next();
//    System.out.println("请输入密码:");
//    String password = sc.next();

   // String sql = "insert into admin(id,username,password)values(15,'" + name + "','" + password + "')";
    String sql ="delete from admin where id=15";
    System.out.println(sql);
    try {
      Statement statement = con.createStatement();
      //  int  result=statement.executeUpdate(sql); //返回int类型
//      if (result > 0) {
//        System.out.println("插入成功...");
//      }
      boolean flag = statement.execute(sql); // 跟新成功  返回false  表示数据库没有给出返回数据

      if(!flag){
        System.out.println("。。。。。。"+flag);
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }


  }

}
