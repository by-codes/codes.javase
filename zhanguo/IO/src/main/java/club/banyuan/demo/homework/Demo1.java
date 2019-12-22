package club.banyuan.demo.homework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo1 {

  /*
    利用字节流或者换成字节流的方式以指定的格式输入数据
    如:xxx,xxx,xxx,最后一个数据以 .号结束，一行最多五个数据
   */
  public static void main(String[] args) throws IOException {
    File file = new File("a.txt");
    if (!file.exists()) {
      file.createNewFile();
    }
    List list=new ArrayList();
    list.add("小吴萨");
    list.add("小刘阿");
    list.add(43);
    list.add(12.3);
    list.add('a');
    list.add('b');
    list.add("啥大事");

    int count=0;
    OutputStream  os=new FileOutputStream(file,true);

    while(count<list.size()){
      os.write(String.valueOf(list.get(count)).getBytes());
      if(count!=0 && (count+1)%5==0 || count==list.size()-1){
        os.write(".\n".getBytes());
      }else{
        os.write(",".getBytes());
      }
      count++;

    }
    os.close();

  }


}
