/*
 * Copyright (C) 2018-2019 Banyuan All rights reserved
 */
/**
 * xml处理：添加
 * @version 1.0
 * @author Yang Wen
 *
 */
package com.banyuan.xml;

import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class AddXMLByDom4J {
    public static void main(String args[]) throws Exception {
        SAXReader sax = new SAXReader();
        Document doc = sax.read("user.xml");

        Element root = doc.getRootElement();

        Element user = root.addElement("user");
        user.addElement("username").addText("李四");

        user.addElement("age").addText("30");

        OutputFormat out = OutputFormat.createPrettyPrint();
        XMLWriter writer = new XMLWriter(new FileOutputStream("user.xml"), out);
        writer.write(doc);
        writer.close();
    }
}
