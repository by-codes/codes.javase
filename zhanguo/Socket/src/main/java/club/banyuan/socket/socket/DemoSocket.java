package club.banyuan.socket.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class DemoSocket {


  public static void main(String[] args) {

    // InetAddress ip=new  InetAddress("14.215.177.39");

    try {
      InetAddress ip= InetAddress.getLocalHost();

      System.out.println(ip); //  sanyedeMacBook-Air.local/192.168.11.22
      System.out.println(ip.getHostName());
      System.out.println(ip.getHostAddress());
      System.out.println(InetAddress.getByName("192.168.11.160").getHostName());


    } catch (UnknownHostException e) {
      e.printStackTrace();
    }

  }


}
