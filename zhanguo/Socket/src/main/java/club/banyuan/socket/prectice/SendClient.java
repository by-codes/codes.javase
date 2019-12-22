package club.banyuan.socket.prectice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendClient {


  public static void main(String[] args) {
    //发送端
    try {
      DatagramSocket  ds=new DatagramSocket();
      InetAddress  ip=InetAddress.getLocalHost();
      Scanner sc=new Scanner(System.in);
      System.out.println("请输入：");
      String str=sc.nextLine();
      DatagramPacket  dp=null;
      while(str!=null){
        if("886".equals(str)){
          break;
        }
        dp=new DatagramPacket(str.getBytes(), str.getBytes().length,ip,1234);
        ds.send(dp);
        System.out.println("请输入：");
        str=sc.nextLine();
      }
      ds.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
