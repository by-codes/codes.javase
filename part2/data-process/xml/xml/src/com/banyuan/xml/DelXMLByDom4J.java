/*
 * Copyright (C) 2018-2019 Banyuan All rights reserved
 */
/**
 * xml处理：删除
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

//删除名字叫Jack的用户
public class DelXMLByDom4J {
    public static void main(String args[]) throws Exception {
        SAXReader sax = new SAXReader();
        Document doc = sax.read("user.xml");
        // 得到根元素坐标
        Element root = doc.getRootElement();

        List nodes = doc.selectNodes("//user");

        for (int i = 0; i < nodes.size(); i++) {
            Element el = (Element) nodes.get(i);

            //if (el.elementText("username").equals("mike")) {
            if (el.elementText("username").equals("李四")) {
                // 必须在根元素的坐标点上删除元素才可以
                root.remove(el);
            }
        }

        OutputFormat format = OutputFormat.createPrettyPrint();
        XMLWriter writer = new XMLWriter(new FileOutputStream("user.xml"),
                                         format);
        writer.write(doc);
        writer.close();
    }
}
