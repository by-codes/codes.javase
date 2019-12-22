/*
 * Copyright (C) 2018-2019 Banyuan All rights reserved
 */
/**
 * 人类
 * @version 1.0
 * @author Yang Wen
 *
 */
package com.banyuan.json;

import java.util.List;

public class People {
    private int id;
    private String name;
    private Address address;
    private List<People> friends;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<People> getFriends() {
        return friends;
    }

    public void setFriends(List<People> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "People [id=" + id + ", name=" + name + ", address=" + address + ", friends=" + friends + "]";
    }

}
