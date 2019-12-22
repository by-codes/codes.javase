package club.banyuan.demo.nio;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class NIODemo {


  public static void main(String[] args) {
    //新的IO  直接通过内存访问 而不需要去访问文件
    URI uri= null;
    try {

      uri = new URI("file:///a.txt");
      Path  pa=Paths.get(uri);
     // System.out.println();
     // Files.delete(pa.getFileName());
    Files.write(pa.getFileName(), "啥啥啥".getBytes(), StandardOpenOption.WRITE);

    } catch (URISyntaxException | IOException e) {
      e.printStackTrace();
    }

  }
}
