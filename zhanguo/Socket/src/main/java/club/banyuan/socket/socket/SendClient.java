package club.banyuan.socket.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

public class SendClient {


  public static void main(String[] args) {
    //发送端
    try {
      DatagramSocket  ds=new DatagramSocket();
      String  str="你好";

      InetAddress  ip=InetAddress.getLocalHost();

      DatagramPacket  dp=new DatagramPacket(str.getBytes(), str.getBytes().length,ip,1234);

      ds.send(dp);

      ds.close();


    } catch (IOException e) {
      e.printStackTrace();
    }

  }


}
