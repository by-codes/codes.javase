package club.banyuan.jdbc;

import club.banyuan.jdbc.pojo.Major;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Demo2 {

  static List<Major> list = new ArrayList<>();

  public static void main(String[] args) {
    //连接数据库的地址
    String url = "jdbc:mysql://192.168.11.15:3306/banyuan";  // jdbc:mysql://localhost:端口号/数据库名字

    try {
      //1.加载驱动
      Class.forName("com.mysql.jdbc.Driver");
      //2.获取连接对象
      Connection con = DriverManager.getConnection(url, "root", "banyuan");
//            if(con==null){
//                System.out.println("数据库库没连接上");
//            }else{
//                System.out.println("数据库连接成功...");
//            }

      Statement st = con.createStatement();
      String sql = "select * from major";

      //   ResultSet rs=st.executeQuery(sql);  //执行sql语句

      //  System.out.println(rs.next());
//        while(rs.next()){
//            //System.out.println(rs.getInt(1)+"="+rs.getString(2));
//            //System.out.println(rs.getInt("majorid")+"----"+rs.getString("majorname"));
//            int  marjorid=rs.getInt("majorid");
//            String  majorname=rs.getString("majorname");
//            Major  ma=new Major(marjorid, majorname);
//
//            list.add(ma);
//
//        }
      show();

    } catch (Exception e) {
      e.printStackTrace();
    }


  }

  //想要用到查询出来的结果 进行其他操作... 进行显示

  public static void show() {

    for (Major s : list) {
      System.out.println(s.toString());
    }


  }


}
