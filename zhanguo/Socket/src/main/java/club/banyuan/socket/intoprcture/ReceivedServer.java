package club.banyuan.socket.intoprcture;

import com.csvreader.CsvWriter;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

public class ReceivedServer {

  //服务器在启动的时候就应该创建文件了
  static File file = new File("student.jpg");

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
    InputStream is = null;
    OutputStream os = null;
    ServerSocket serverSocket = null;
    try {
      serverSocket = new ServerSocket(5681);
      Socket s = serverSocket.accept();
      is = new BufferedInputStream(s.getInputStream());
      byte[] by = new byte[69191];
      int d;
      os = new BufferedOutputStream(new FileOutputStream(file));
      while ((d = is.read(by)) != -1) {
        os.write(by, 0, d);
        os.flush();
      }

      OutputStream  o=s.getOutputStream();
      o.write("图片上传成功".getBytes());
      o.close();


    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (is != null) {
          is.close();
        }
        if (os != null) {
          os.close();
        }
      } catch (IOException e) {
        e.printStackTrace();

      }
    }

  }

}
