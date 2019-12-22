package club.banyuan.socket.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
import jdk.internal.util.xml.impl.Input;

public class SendClient {

  public static void main(String[] args) {
    Socket  socket=null;
    try {

     while(true) {
       socket=new Socket("192.168.11.22", 5678);
       Scanner  sc=new Scanner(System.in);
       System.out.println("请输入:");
       String  str=sc.nextLine();
       OutputStream os = socket.getOutputStream();
       os.write(str.getBytes());
       os.flush();

       InputStream  s=socket.getInputStream();
       byte[] by=new byte[1024];
       int len=s.read(by);
       String st=new String(by,0,len);
       System.out.println("服务器端返回来的数据:"+st);

     }
    } catch (IOException e) {
      e.printStackTrace();
    }


  }


}
