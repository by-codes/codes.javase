/*
 * Copyright (C) 2018-2019 Banyuan All rights reserved
 */

package com.banyuan.mars.library;

import java.io.File;
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

public class Book {
    private String isbn = "";
    private String name = "";
    private float price;
    private String press = "";
    private String figure = "";
    private String author = "";
    private String url = "";

    public Book() {
    }

    public Book(String isbn, String name, float price, String press, String figure, String author, String url) {
        this.isbn = isbn;
        this.name = name;
        this.price = price;
        this.press = press;
        this.figure = figure;
        this.author = author;
        this.url = url;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getPress() {
        return this.press;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }

    public String getFigure() {
        return this.figure;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }
}