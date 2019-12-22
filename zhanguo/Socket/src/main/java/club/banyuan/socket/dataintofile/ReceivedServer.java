package club.banyuan.socket.dataintofile;

import com.csvreader.CsvWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import jdk.nashorn.internal.ir.IdentNode;

public class ReceivedServer {

  //服务器在启动的时候就应该创建文件了
  static File file = new File("student.csv");

  static {
    if (!file.exists()) {
      try {
        file.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
        System.out.println("文件没有创建成功...");
      }
    }
  }

  public static void main(String[] args) {
    ServerSocket serverSocket = null;
    try {
      serverSocket = new ServerSocket(5688);
      Socket s = serverSocket.accept();
      InputStream  is=s.getInputStream();
      byte [] by=new  byte[1024];
      int len=is.read(by);
      String  st=new String(by,0,len);
      String [] ts=st.split(",");

      CsvWriter  csvWriter=new CsvWriter("student.csv",',', Charset.forName("utf-8"));
      csvWriter.writeRecord(ts);
      csvWriter.flush();


    } catch (IOException e) {
      e.printStackTrace();
    }


  }


}
