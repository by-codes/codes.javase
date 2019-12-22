package club.banyuan.socket.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceviedServer {

  public static void main(String[] args) {
    try {
      DatagramSocket  ds=new DatagramSocket(1234);
      byte[] by=new  byte[1024];
      DatagramPacket  dp=new DatagramPacket(by,by.length);
      ds.receive(dp);

     byte[] bu=dp.getData();
      System.out.println("...."+dp.getLength());


      String   str=new String(bu,0,dp.getLength());
      System.out.println(str);

      ds.close();

    } catch (SocketException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }


  }

}
