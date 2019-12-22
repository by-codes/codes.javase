/*
 * Copyright (C) 2018-2019 Banyuan All rights reserved
 */

package com.banyuan.mars;

import com.banyuan.mars.library.*;
import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    // public static void main(String[] args) {
    //     System.out.println(new App().getGreeting());
    // }

    // public static void main(String[] args) throws Exception {
    //     ArrayList books = BookParser.parse("./resources/books.xml");
    //     for (Object obj : books) {
    //         Book book = (Book)obj;
    //         System.out.println("书名: " + book.getName());
    //         System.out.println("价格: " + book.getPrice());
    //         System.out.println("出版社: " + book.getPress());
    //         System.out.println("作者: " + book.getAuthor());
    //         System.out.println("================================================");
    //     }
    // }

    // public static void main(String[] args) throws Exception {
    //     Bookshelf shelf = new Bookshelf();
    //     for (Object obj : shelf.getAll()) {
    //         Book book = (Book)obj;
    //         System.out.println("书名: " + book.getName());
    //         System.out.println("价格: " + book.getPrice());
    //         System.out.println("出版社: " + book.getPress());
    //         System.out.println("作者: " + book.getAuthor());
    //         System.out.println("");
    //     }
    // }

    public static void main(String[] args) throws Exception {
        MasterReader.parse("/master.csv");
        // for (Object obj : shelf.getAll()) {
        //     Book book = (Book)obj;
        //     System.out.println("书名: " + book.getName());
        //     System.out.println("价格: " + book.getPrice());
        //     System.out.println("出版社: " + book.getPress());
        //     System.out.println("作者: " + book.getAuthor());
        //     System.out.println("");
        // }
    }
}