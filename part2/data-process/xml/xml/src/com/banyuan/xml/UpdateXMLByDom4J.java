/*
 * Copyright (C) 2018-2019 Banyuan All rights reserved
 */
/**
 * xml处理：更新
 * @version 1.0
 * @author Yang Wen
 *
 */
package com.banyuan.xml;

import java.io.FileOutputStream;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

//将年龄为30的元素中的username设置为张三(说明对中文的操作也没有任何问题)
public class UpdateXMLByDom4J {
    public static void main(String args[]) throws Exception {
        // 创建SAXReader的对象
        SAXReader sax = new SAXReader();
        // 读入xml文件，并将其转换为Document类型
        Document doc = sax.read("user.xml");

        // 利用XPath技术得到所有user节点
        List nodes = doc.selectNodes("//user");

        for (int i = 0; i < nodes.size(); i++) {
            // 得到单个元素
            Element el = (Element) nodes.get(i);

            // 判断其名字是否为Jack
            if (el.elementText("age").equals("30")) {
                // 得到该元素下的age元素
                Element elAge = el.element("username");
                elAge.setText("张三");
            }
        }

        // 将修改后的Document转换至硬盘
        OutputFormat out = OutputFormat.createPrettyPrint();
        XMLWriter writer = new XMLWriter(new FileOutputStream("user.xml"), out);
        writer.write(doc);
        writer.close();

    }
}
