package club.banyuan.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IODemo1 {

  /*    字节流  输入字节 InputStream  输出字节流OutputStream
    io
        字符流  .....      ......
   */
  public static void main(String[] args) throws IOException {

    File file = new File("a.txt");
    InputStream  is=null;
    try {
      //字节输入流
      is=new FileInputStream(file);  //从文件进行读取
      byte [] by=new byte[(int)file.length()];
       // is.read(by); //如果文件里面没有内容   就返回-1
       // is.read(by, 3, 12);
      int count=0;
      int  line=is.read();
      while(line!=-1){
        by[count++]= (byte) line;
        line=is.read();
      }
        String  str=new String(by);
        System.out.println(str+by.length);

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } finally {
      try {
        if(is!=null){
          is.close();  //为什么流要关闭？1.
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }


    //字节输入流
//    OutputStream  os=new FileOutputStream(file);
//    os.write("你好我是谁".getBytes("gbk"));
//    os.close();

//    InputStream  is=null;
//    is=new FileInputStream(file);  //从文件进行读取
//    byte [] by=new byte[(int)file.length()];
//    // is.read(by); //如果文件里面没有内容   就返回-1
//    is.read(by);
//    String  str=new String(by,"gbk");
//    System.out.println(str+by.length);


    //  把a文件里面的数据写入b文件里面






  }

}
