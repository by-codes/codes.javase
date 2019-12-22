package club.banyuan.xmlparse.xmlSaxparse;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler {

  private List list;
  private Student stu;
  private String s;

  public List getList() {
    return list;
  }
  @Override
  public void startDocument() throws SAXException {
    //当你开始解析文档的时候创建集合
    list = new ArrayList<>();
  }

  @Override
  public void endDocument() throws SAXException {
    System.out.println("结束解析...");
  }
  @Override
  public void startElement(String uri, String localName, String qName, Attributes attributes)
      throws SAXException {
    System.out.println("------->>" + qName);
    if (qName != null) {
      s = qName;
      if (qName.equals("student")) {  //qName 是student标签 意味着可以创建Student对象
        stu = new Student();
      }
    }
  }
  @Override
  public void endElement(String uri, String localName, String qName) throws SAXException {
    if (qName != null) {
      if (qName.equals("student")) {
        list.add(stu);
      }
    }
    s = null;
  }

  @Override
  public void characters(char[] ch, int start, int length) throws SAXException {

    String str = new String(ch, start, length);
    //System.out.println("标签的内容..."+str);
    //将获取到的文本内容存放到对象里面去
    // System.out.println("++++++++++++++++++++++"+str);

    if (s != null) {
      if (s.equals("name")) { //name   age    address
        stu.setName(str);
      }
      if (s.equals("age")) {
        stu.setAge(Integer.valueOf(str));
      }
      if (s.equals("address")) {
        stu.setAddress(str);
      }
    }

  }
}
