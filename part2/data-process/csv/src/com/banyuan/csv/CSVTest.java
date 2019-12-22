/*
 * Copyright (C) 2018-2019 Banyuan All rights reserved
 */
/**
 * 使用commons-csv.jar包进行csv格式文件生成和读取
 * @version 1.0
 * @author Yang Wen
 *
 */
package com.banyuan.csv;

import java.io.FileReader;
import java.io.PrintWriter;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

public class CSVTest {
    public static void main(String[] args) {
        CSVTest t1 = new CSVTest();

        try {
            t1.write();
            t1.read();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void write() throws Exception {
        Appendable out = new PrintWriter("file.csv");
        CSVPrinter printer = CSVFormat.DEFAULT.withHeader("userId", "userName").print(out);

        for (int i = 0; i < 10; i++) {
            printer.printRecord("userId" + i, "userName" + i);
        }

        printer.flush();
        printer.close();
    }

    public void read() throws Exception {
        FileReader reader = new FileReader("file.csv");
        CSVParser parser = CSVFormat.DEFAULT.withHeader("userId", "userName").parse(reader);

        for (CSVRecord record : parser) {
            System.out.println(record.get("userId") + ":" + record.get("userName"));
        }

        reader.close();
    }

}