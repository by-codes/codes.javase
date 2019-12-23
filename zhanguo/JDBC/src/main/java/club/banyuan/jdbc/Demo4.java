package club.banyuan.jdbc;

import club.banyuan.jdbc.pojo.Major;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo4 {

    static List<Major> list=new ArrayList<>();

    public static void main(String[] args) {
        Statement    st=null;
        Connection con=null;
        ResultSet  set=null;
        PreparedStatement  ps=null;   //是对 sql语句进行预处理  防止sql注入
    //连接数据库的地址
        String url="jdbc:mysql://localhost:3306/jian";  // jdbc:mysql://localhost:端口号/数据库名字

        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接对象
           con=DriverManager.getConnection(url, "root", "zhou");

           // st=con.createStatement();

            Scanner  sc=new Scanner(System.in);
            System.out.println("请输入账户名");
            String  username=sc.next();
            System.out.println("请输入密码:");
            String  password=sc.next();

          //  String  sql="select * from admin where username =  '"+username+"' and  password =  '"+password+"'";

            /*
                请输入账户名
                john
                请输入密码:
                234'or'1'='1
                select * from admin where username =  'john' and  password =  '234'or'1'='1'
                欢迎john登录
            以上情况叫sql注入

            为了防止sql注入问题   Apache公司又提供了一个api接口

            System.out.println(sql);

            set=st.executeQuery(sql);  //0  表示没有更新成功   1表示更新成功
             */

         //   String   sql="select *from admin where username= ? and  password = ?";  //? 占位符
            String  sql="{call admin_into(?,?)}";  //调用存储过程
            ps=con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);

            int  result=ps.executeUpdate();
            if(result>0){
                System.out.println("插入成功....");
            }
         //  set = ps.executeQuery();

//               if(set.next()){
//                   System.out.println("欢迎"+set.getString("username")+"登录");
//               }


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(st!=null) {
                    st.close();
                }
                if(con!=null){
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

}
