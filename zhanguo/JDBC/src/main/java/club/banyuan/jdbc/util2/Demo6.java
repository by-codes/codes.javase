package club.banyuan.jdbc.util2;


import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class Demo6 {
    private static DataSource  dataSource=null;

    static{
        // 获取当前类的加载器来加在这个properties文件
        InputStream   is=Demo6.class.getClassLoader().getResourceAsStream("db.properties");
        Properties  p=new Properties();
        try {
            p.load(is);
            dataSource= BasicDataSourceFactory.createDataSource(p);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static  Connection  getConnection() throws SQLException {


        return  dataSource.getConnection();

    }







}
