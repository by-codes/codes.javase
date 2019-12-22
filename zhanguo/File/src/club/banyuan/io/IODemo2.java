package club.banyuan.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class IODemo2 {

  public static void main(String[] args) throws IOException {

    File file = new File("a.txt");
    OutputStream  os=new FileOutputStream(file,true);
//    os.write("\n".getBytes());
//    os.write("你是谁?".getBytes());
//    os.close();

    Person  p1=new Person("李四1",35,"公园");
    Person  p2=new Person("李四2",35,"公园");
    Person  p3=new Person("李四3",35,"公园");

    List  list=new ArrayList();
    list.add(p1);
    list.add(p2);
    list.add(p3);

    for (int i = 0; i < list.size(); i++) {
      Person obj=(Person)list.get(i);
      os.write(obj.getName().getBytes());
      os.write(",".getBytes());
      os.write(String.valueOf(obj.getAge()).getBytes());
      os.write(",".getBytes());
      os.write(obj.getAddress().getBytes());
      os.write(".\n".getBytes());
      //os.write("\n".getBytes());
    }
    os.close();
    //  任务:读取该文件内容




  }

}
