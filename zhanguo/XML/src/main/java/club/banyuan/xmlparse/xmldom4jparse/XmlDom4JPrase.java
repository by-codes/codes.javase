package club.banyuan.xmlparse.xmldom4jparse;

import java.util.Iterator;
import java.util.List;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.xml.sax.Attributes;


public class XmlDom4JPrase {

  /*
      灵活性高
      易用性和功能强大

     缺点： api复杂
          可移植性比较差

     创建  SAXReaDer

   */

  public static void main(String[] args) throws DocumentException {
    //创建解析器
    SAXReader   saxReader=new SAXReader();
    //加载xml
    Document  document=saxReader.read("student.xml");
    // 获取根节点
   Element element= document.getRootElement();
  //  System.out.println(element.getName());
    Iterator instance= element.elementIterator();
    while (instance.hasNext()){
      Element   et=(Element) instance.next();//下一个元素  student
//      List  list= et.attributes();
//      for (Object  obj:list) {
//        Attribute  attribute=(Attribute)obj;
//        System.out.println(attribute.getName()+"---"+attribute.getValue());
 //     }
      Iterator  it= et.elementIterator();
      while (it.hasNext()){
        Element   e=(Element) it.next();
        System.out.println(e.getName()+"---"+e.getStringValue());
      }

    }
  }
}
