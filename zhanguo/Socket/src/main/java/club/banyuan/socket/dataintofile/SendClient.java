package club.banyuan.socket.dataintofile;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SendClient {

  public static void main(String[] args) {
    Socket  socket=null;
    try {
      socket=new Socket("192.168.11.22", 5688);
      OutputStream  os=socket.getOutputStream();
      os.write("姓名,年龄,性别,住址,联系方式".getBytes());
      os.flush();

    } catch (IOException e) {
      e.printStackTrace();
    }


  }



}
