/*
 * Copyright (C) 2018-2019 Banyuan All rights reserved
 */

package com.banyuan.mars.library;

import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@SuppressWarnings("unchecked")
public class BookParser {
    public static ArrayList parse(String file) throws Exception {
        //得到解析工厂DocumentBuilderFactory
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        //得到解析器DocumentBuilder
        DocumentBuilder builder =  factory.newDocumentBuilder();
        //解析指定的XML文档，得到代表内存DOM树的Document对象
        Document document = builder.parse(file);
        return _parse(document);
    }

    public static ArrayList _parse(Document document) {
        Element rootNode = document.getDocumentElement();

        NodeList bookNodes = rootNode.getChildNodes();
        ArrayList books = new ArrayList();
        int len = bookNodes.getLength();
        for (int i = 0; i < len; i++) {
            Node bookNode = bookNodes.item(i);
            if (bookNode.getNodeName() == "book") {
                Book book = new Book();
                NodeList props = bookNode.getChildNodes();
                for (int j = 0; j < props.getLength(); j++) {
                    Node item = props.item(j);
                    if (item.getNodeType() == Node.ELEMENT_NODE) {
                        String value = " ... ";
                        if (item.getFirstChild() != null) {
                            value = item.getFirstChild().getNodeValue();
                        }
                        if (item.getNodeName() == "name") {
                            book.setName(value);
                        }
                        if (item.getNodeName() == "price") {
                            book.setPrice(Float.valueOf(value));
                        }
                        if (item.getNodeName() == "press") {
                            book.setPress(value);
                        }
                        if (item.getNodeName() == "author") {
                            book.setAuthor(value);
                        }
                        if (item.getNodeName() == "figure") {
                            book.setFigure(value);
                        }
                        if (item.getNodeName() == "url") {
                            book.setUrl(value);
                        }
                        // System.out.println(item.getNodeName() + ": " + value);
                    }
                }
                books.add(book);
                // System.out.println(" ");
            }
        }
        return books;
    }
}