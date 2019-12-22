package club.banyuan.xmlparse.xmldomParse;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlDomParse {
  /*
    XML:可扩展标记语言
    不受任何编程语言和操作系统的限制
    作用：配置应用程序和网站
         数据交互
         ajax基石  x--->xml
    xml 文件由什么组成
    1.<?xml version="1.0" encoding="UTF-8" ?>  必有
    2.根元素
    3.元素   xml里所有的元素(标签)必须一对一 有结束有开始标签
    4.命名规则：字母可以包含数字和其他字符
      <元素 属性名="值">文本,（元素）标签也行</元素>
    注意:xml文件的创建和数据的修改是浪费时间,不方便
    重点是对xml文件进行解析
      DOM  解析     把整个的xml文档当成对象来进行处理 会先把文档读取到内存
          是基于一个树的结构
                    根
                子1      子2
             子1a  子1b 子2a  子2b
          需要加载文档构造dom树
          1.创建dom解析工厂 DocumentBuilderFactory
          2.创建文档对象解析器  DocumentBuilder
          3.由解析器生成文档对象
          4.文档对象从dom树根节点开始遍历解析

      SAX  解析
          1.得到文件   流的方式也好  uri 也行
          2.得到解析工厂
          3.由解析工厂生产解析器
          4.由解析器和处理去处理xml文件
      DOM4j 解析

   */

  public static void main(String[] args)
      throws ParserConfigurationException, IOException, SAXException {
    DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
    //创建dom文档的机器
    DocumentBuilder db=documentBuilderFactory.newDocumentBuilder();
    Document  document= db.parse(XmlDomParse.class.getClassLoader().getResourceAsStream("student.xml"));
    NodeList   nodeList=document.getElementsByTagName("student");
    //System.out.println(nodeList.getLength());
    Node node= nodeList.item(0);
    System.out.println(node.getLastChild().getFirstChild().getNodeValue());
    
  }
}
