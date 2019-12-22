/*
 * Copyright (C) 2018-2019 Banyuan All rights reserved
 */
/**
 * 测试类，生成json文件
 * @version 1.0
 * @author Yang Wen
 *
 */
package com.banyuan.json;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        List<People> list = new ArrayList<People>();

        People people1 = new People();
        Address address1 = new Address();

        address1.setHomeAddress("beijing");
        address1.setCompanyAddress("shanghai");

        people1.setId(1);
        people1.setName("zhangsan");
        people1.setAddress(address1);

        People people11 = new People();
        people11.setId(5);
        people11.setName("zhangsan11");

        People people12 = new People();
        people11.setId(6);
        people11.setName("zhangsan12");

        List<People> list1 = new ArrayList<People>();
        list1.add(people11);
        list1.add(people12);

        people1.setFriends(list1);

        System.out.println("--------------");

        People people2 = new People();
        Address address2 = new Address();
        address2.setCompanyAddress("liaoning");
        address2.setHomeAddress("jilin");

        people2.setId(2);
        people2.setName("lisi");
        people2.setAddress(address2);

        List<People> list2 = new ArrayList<People>();

        People people21 = new People();
        people21.setId(3);
        people21.setName("lisi11");

        People people22 = new People();
        people21.setId(4);
        people21.setName("lisi12");

        list2.add(people21);
        list2.add(people22);

        people2.setFriends(list2);

        list.add(people1);
        list.add(people2);

        Gson gson = new Gson();
        String result = gson.toJson(list);
        System.setOut(new PrintStream("people.json"));

        System.out.println(result);
    }




}
