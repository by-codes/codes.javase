/*
 * Copyright (C) 2018-2019 Banyuan All rights reserved
 */
/**
 * 地址类
 * @version 1.0
 * @author Yang Wen
 *
 */
package com.banyuan.json;

public class Address {
    private String homeAddress;
    private String companyAddress;

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    @Override
    public String toString() {
        return "Address [homeAddress=" + homeAddress + ", companyAddress=" + companyAddress + "]";
    }

}
