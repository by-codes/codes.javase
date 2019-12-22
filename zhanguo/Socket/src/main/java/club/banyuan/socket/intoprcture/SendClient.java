package club.banyuan.socket.intoprcture;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SendClient {

  public static void main(String[] args) {
    Socket socket = null;
    BufferedInputStream is = null;
    BufferedOutputStream os = null;
    File file = new File("/Users/sanye/img/1.jpg");

    try {
      is = new BufferedInputStream(new FileInputStream(file));
      byte[] by = new byte[(int) file.length()];
      socket = new Socket("192.168.11.22", 5681);
      os = new BufferedOutputStream(socket.getOutputStream());
      int d;
      while((d=is.read(by,0,by.length))!=-1){
        os.write(by,0,d); //缓冲刷新  不然会造成数据丢失
        os.flush();
      }

      //如果从服务器端返回数据了  那么在这里就要告诉服务器端没有输入了
      // 不然服务器端可能还在等候 如果是循环接收数据会造成异常
      socket.shutdownOutput();

      InputStream i=socket.getInputStream();
      byte []b=new byte[100];
      int len=i.read(b);
      String  str=new String(b,0,len);
      System.out.println(str);

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (os != null) {
          os.close();
        }
        if (is != null) {
          is.close();
        }
      } catch (IOException e) {
        e.printStackTrace();

      }
    }


  }


}
