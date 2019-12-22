package club.banyuan.socket.prectice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceviedServer extends  Thread{

//  @Override
//  public void run() {
//
//  }

  public static void main(String[] args) {
     // new ReceviedServer().start();

    DatagramSocket ds=null;
    try {
      ds= new DatagramSocket(1234);
      while (true) {
        byte[] by = new byte[1024];
        DatagramPacket dp = new DatagramPacket(by, by.length);
        ds.receive(dp);
        byte[] bu = dp.getData();
        System.out.println("...." + dp.getLength());

        String str = new String(bu, 0, dp.getLength());
        System.out.println(dp.getAddress().getHostName()+"说:"+str);
      }
     //ds.close();

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
