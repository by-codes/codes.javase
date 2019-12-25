package club.banyuan.jdbc02.service.impl;

import club.banyuan.jdbc02.dao.AdminDao;
import club.banyuan.jdbc02.dao.impl.AdminDaoImpl;
import club.banyuan.jdbc02.pojo.Admin;
import club.banyuan.jdbc02.service.AdminService;
import club.banyuan.jdbc02.util.DBUtil;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.List;

public class AdminServiceImpl implements AdminService {

  AdminDao adminDao = new AdminDaoImpl();

  @Override
  public void addAdmin(Admin admin) {
    System.out.println("在做插入操作....");//  admin 数据能不做个检查
    adminDao.insertAdmin(admin);

  }

  @Override
  public void delByName(String name) {
    //在删除之前  先做查询操作
    if (adminDao.getByName(name) != null) {
      adminDao.delByName(name);
    } else {
      System.out.println("没这个人....");
    }

  }

  @Override
  public void addAdmin(List list) {
    adminDao.insertAdmin(list);
  }

  @Override
  public void updateMoney(String uName, Double money, String oName) {

    //事务处理
    try {

      DBUtil.conn.setAutoCommit(false);//设置自动提交为false

      adminDao.updateMoney(uName, -money); //把第一个人的前转给第二个人

      System.out.println(1 / 0);

      adminDao.updateMoney(oName, money);

      DBUtil.conn.commit();

    } catch (Exception e) {
      e.printStackTrace();

      try {
        DBUtil.conn.rollback();
      } catch (SQLException ex) {
        ex.printStackTrace();
      }
    }


  }


  public void updateMoney(String uName, Double money,
      String oName, String oUsername) {
    Savepoint A=null;
    Savepoint  B=null;
    //事务处理
    try {
      DBUtil.conn.setAutoCommit(false);//设置自动提交为false
      A= DBUtil.conn.setSavepoint("A");
      adminDao.updateMoney(uName, -money);
      B = DBUtil.conn.setSavepoint("B");
      adminDao.updateMoney(oName, -money);
      System.out.println(1 / 0);
      adminDao.updateMoney(oUsername, money);
      DBUtil.conn.commit();
    } catch (Exception e) {
      try {
        DBUtil.conn.rollback(B);
        DBUtil.conn.commit();  //事务要提交   不然没有及时更新不能显示数据
      } catch (SQLException ex) {
        ex.printStackTrace();
      }
      e.printStackTrace();
    }finally {
      DBUtil.closeCon();
    }


  }







}
