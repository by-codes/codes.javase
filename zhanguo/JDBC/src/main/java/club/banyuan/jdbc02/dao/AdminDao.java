package club.banyuan.jdbc02.dao;

import club.banyuan.jdbc02.pojo.Admin;
import java.util.List;

public interface AdminDao {

  //增加admin
  void    insertAdmin(Admin admin);  //你增加的数据是从外部

  //删除   根据用户名字来删除用户
  void    delByName(String  name);

  //跟新操作

   void insertAdmin(List list);
  //查询操作  根据指定的字符来查询   根据名字里面有 '上' 来查询  模糊查询    like
  List getBySingleStr(String singleName);

  //根据名字来查询有没有这个数据
  Admin   getByName(String  name);

  //转账功能
  void   updateMoney(String   uName,Double money);

}
