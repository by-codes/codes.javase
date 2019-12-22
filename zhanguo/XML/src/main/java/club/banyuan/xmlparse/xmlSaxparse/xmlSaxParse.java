package club.banyuan.xmlparse.xmlSaxparse;

import java.io.IOException;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class xmlSaxParse {

  /*
    SAX 优点：不需要将整个文档加载到内存里面  内存消耗小
        缺点: 不能支持原地修改 没有内置的文档导航支持  不支持随机访问...
     SAX 适合对xml文档读取

   */



  public static void main(String[] args)
      throws ParserConfigurationException, SAXException, IOException {
    //1.得到解析工厂
    SAXParserFactory  saxParserFactory=SAXParserFactory.newInstance();
    //2.获取SAX解析器
    SAXParser saxParser=saxParserFactory.newSAXParser();
    MyHandler  myHandler=new MyHandler();
    //3.对文件进行解析
    saxParser.parse("student.xml", myHandler);
    List  list=myHandler.getList();
    for (Object  obj:list) {
      Student  s=(Student)obj;
      System.out.println(s.toString());
    }

  }


}
