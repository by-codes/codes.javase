package club.banyuan.jdbc02.service;

import club.banyuan.jdbc02.pojo.Admin;
import java.util.List;

public interface AdminService {

   void   addAdmin(Admin admin);

   void   delByName(String  name);

   void   addAdmin(List list);

   void  updateMoney(String  uName,Double  money,String oName);


}
