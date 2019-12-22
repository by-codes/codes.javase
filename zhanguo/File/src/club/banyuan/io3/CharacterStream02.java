package club.banyuan.io3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterStream02 {

  /*
      字符流   Reader   Writer
      
   */
  public static void main(String[] args) throws IOException {
    File file=new File("a.txt");
//    Writer  writer=new FileWriter(file);
//    writer.write("字符流");
//    writer.flush();
//
//    //任务2：完善读取内容
//    Reader  reader=new FileReader(file);


    Writer  writer=new FileWriter(file);
    BufferedWriter bw=new BufferedWriter(writer);
    bw.write("大博阿基");
    bw.write("\n");
    bw.write("你四叔");
    bw.flush();

    BufferedReader  bufferedReader=new BufferedReader(new FileReader(file));
    char []  ch=new char[8];
    //bufferedReader.read(ch);
    String  st=bufferedReader.readLine();
    while (st!=null){
      System.out.println(st);
      st=bufferedReader.readLine(); //读取一行数据
    }
    String  str=new String(ch);
    //作业：分别用字节流和字符流把集合里面的数据写入doc文件
    /*
      数据流
      随机流
      序列化
      properties
     */
  }
}
