package club.banyuan.jdbc;

import club.banyuan.jdbc02.pojo.Admin;
import club.banyuan.jdbc02.service.AdminService;
import club.banyuan.jdbc02.service.impl.AdminServiceImpl;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class TestAdmin {

  @Test
  public  void   test(){
    Admin  admin1=new Admin("张飞8","123456",4567.34);
    AdminService  adminService=new AdminServiceImpl();
    Admin  admin2=new Admin("张飞9","123457",4567.34);
    Admin  admin3=new Admin("张飞10","1236",4567.34);
    Admin  admin4=new Admin("张飞11","12345",4567.34);

    List  list=new ArrayList();
    list.add(admin1);
    list.add(admin2);
    list.add(admin3);
    list.add(admin4);

      adminService.addAdmin(list);
   // adminService.delByName("张飞");

  //  adminService.updateMoney("lyt", 400.0, "john");

  //  new AdminServiceImpl().updateMoney("john", 400.0, "lyt", "lisi");

  }

}
