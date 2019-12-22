package club.banyuan.demo.properties;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

public class PropertiesDemo {

  public static void main(String[] args) throws IOException {
    //  Properties 是一个可以和IO一起使用的集合类  可以把数据保存在流中或者从文件中进行加载  存取格式是  key - value方式
    Properties properties=new Properties();
    properties.put("钻石", new Student("李素文",12,"小输掉"));
    properties.setProperty("萨", "王老五2");
    properties.setProperty("钻石3", "李四");

    //System.out.println(properties);
    File file=new  File("pro.properties");
//    Writer  writer=new FileWriter(file);
//    properties.store(writer, "today is   sunday");
//
//    writer.close();

    Reader read=new FileReader(file);
    properties.load(read);
    System.out.println(properties);




  }
}
