package club.banyuan.demo.serializable;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyObjectOutputStream extends ObjectOutputStream {

  public MyObjectOutputStream(OutputStream out) throws IOException {
    super(out);
  }

  protected MyObjectOutputStream() throws IOException, SecurityException {
  }

  //重写头
  @Override
  protected void writeStreamHeader() throws IOException {

  }
}
