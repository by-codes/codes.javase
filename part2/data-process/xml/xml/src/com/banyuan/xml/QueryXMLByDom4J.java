/*
 * Copyright (C) 2018-2019 Banyuan All rights reserved
 */
/**
 * xml处理：查询
 * @version 1.0
 * @author Yang Wen
 *
 */
package com.banyuan.xml;

import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class QueryXMLByDom4J {

    public static void main(String[] args) {

        SAXReader reader = new SAXReader();

        try {
            Document doc = reader.read("1.xml");
            Element element = doc.getRootElement();

            Iterator it = element.elementIterator();

            while (it.hasNext()) {
                Element e = (Element) it.next();
                String name = e.elementText("name");
                String age = e.elementText("age");
                System.out.println(name + "\t" + age);
            }

        } catch (DocumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
