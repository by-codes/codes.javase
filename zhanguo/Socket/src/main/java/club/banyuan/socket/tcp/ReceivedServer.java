package club.banyuan.socket.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReceivedServer {

  public static void main(String[] args) {

    try {
      ServerSocket  ss=new ServerSocket(5678);
      while(true){
        Socket  socket=ss.accept();
        InputStream  is=socket.getInputStream();
        byte [] by=new byte[1024];
        int   len=is.read(by);

        String  str=new String(by,0,len);
        System.out.println(socket.getInetAddress().getHostName()+"说:"+str);

       OutputStream  os= socket.getOutputStream();
       os.write("我已经接受到了...".getBytes());
       os.flush();
      }
     // is.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
