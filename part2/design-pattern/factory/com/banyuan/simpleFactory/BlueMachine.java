/*
 * Copyright (C) 2018-2019 Banyuan All rights reserved
 */
/**
 * 简单工厂,实现类：BlueMachine
 * @version 1.0
 * @author Yang Wen
 *
 */
package com.banyuan.simpleFactory;
public class BlueMachine implements Machine {
    @Override
    public void work() {
        System.out.println("blue cloth");

    }
}