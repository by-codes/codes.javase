/*
 * Copyright (C) 2018-2019 Banyuan All rights reserved
 */

package com.banyuan.mars.library;

import java.io.*;
import java.util.ArrayList;
import org.apache.commons.csv.*;

@SuppressWarnings("unchecked")
public class MasterReader {
    public static ArrayList parse(String file) throws Exception {
        // Reader in = new StringReader("a,b,c");
        // Reader in = new InputStreamReader(new FileInputStream("./master.csv"));
        Reader in = new InputStreamReader(MasterReader.class.getResourceAsStream(file));
        for (CSVRecord record : CSVFormat.DEFAULT.parse(in)) {
            for (String field : record) {
                System.out.print("\"" + field + "\"| ");
            }
            System.out.println();
        }

        return new ArrayList();
    }
}