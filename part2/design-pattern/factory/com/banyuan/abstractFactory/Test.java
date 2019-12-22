/*
 * Copyright (C) 2018-2019 Banyuan All rights reserved
 */
/**
 * 测试类
 * @version 1.0
 * @author Yang Wen
 *
 */
package com.banyuan.abstractFactory;

public class Test {

    public static void main(String[] args) {
        AbstractFactory f1 = new DefaultFactory();
        f1.createFood();
        f1.createVehicle();
        f1.createWeapon();

    }

}
