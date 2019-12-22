/*
 * Copyright (C) 2018-2019 Banyuan All rights reserved
 */

package com.banyuan.mars.library;

import java.io.File;
import java.util.*;

public class Bookshelf {

    @SuppressWarnings("unchecked")
    public static List<Book> getAll() {
        List<Book> books = new ArrayList<Book>();

        books.add(new Book("9787115474889", "Python基础教程", (float)68.3, "人民邮电出版社", "", "Magnus Lie Hetland", "https://item.jd.com/12279949.html"));
        books.add(new Book("9787111612728", "Effective Java中文版", (float)75.9, "机械工业出版社", "", "Joshua Bloch", "https://item.jd.com/27162020235.html"));
        books.add(new Book("9787115390592", "C Primer Plus 第6版", (float)76.5, "人民邮电出版社", "", "Stephen Prata", "https://item.jd.com/11917487.html"));

        return books;
    }
}