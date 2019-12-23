package club.banyuan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Demo1 {

    public static void main(String[] args) {
    //连接数据库的地址
        String url="jdbc:mysql://localhost:3306/jian";  // jdbc:mysql://localhost:端口号/数据库名字

        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接对象
            Connection con=DriverManager.getConnection(url, "root", "zhou");
            if(con==null){
                System.out.println("数据库库没连接上");
            }else{
                System.out.println("数据库连接成功...");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }



}
