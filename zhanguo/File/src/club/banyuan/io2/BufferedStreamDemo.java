package club.banyuan.io2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamDemo {

  //缓冲字节流
  public static void main(String[] args) throws IOException {
    File   file=new File("a.txt");
    OutputStream fos=new FileOutputStream(file,true);
    BufferedOutputStream   bos=new BufferedOutputStream(fos);

    bos.write("你好大宝贝".getBytes());
    //bos.close();//Stream Closed
    //fos.close();
    bos.flush();  //从内存里面把数据刷新到文件里面  但是这个流没有关闭   还可以继续使用

    bos.write("你好大宝贝2".getBytes());
    bos.flush();

    //bos.close();

    // 缓冲输入流
    InputStream  is=new FileInputStream(file);
    BufferedInputStream   bis=new BufferedInputStream(is);
    byte  [] b=new byte[(int)file.length()];
    bis.read(b);
    bis.close();
    is.close();

    String  st=new String(b);
    System.out.println(st);



  }

}
