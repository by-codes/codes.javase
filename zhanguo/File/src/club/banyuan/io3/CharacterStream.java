package club.banyuan.io3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterStream {

  /*
      字符流   Reader   Writer

   */
  public static void main(String[] args) throws IOException {
    File file=new File("a.txt");
    OutputStream  os=new FileOutputStream(file);
    Writer  writer=new OutputStreamWriter(os);
    writer.write("你好,我是你大爷...");
    writer.write("\n");
    writer.write("你好,我是你大爷...");
    writer.flush();

    InputStream   is=new FileInputStream(file);
    Reader  reader=new InputStreamReader(is);
    char  [] ch=new char[(int)file.length()];  //
    int count=0;
    int   c=reader.read();
    while(c!=-1){
        ch[count++]=(char)c;
        c=reader.read();
    }
    String  str=new String(ch,0,count);
    System.out.println(str);
    reader.close();


  }
}
