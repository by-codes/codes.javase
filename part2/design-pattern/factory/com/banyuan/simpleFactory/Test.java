/*
 * Copyright (C) 2018-2019 Banyuan All rights reserved
 */
/**
 * 简单工厂，测试类
 * @version 1.0
 * @author Yang Wen
 *
 */
package com.banyuan.simpleFactory;

public class Test {

    public static void main(String[] args) {
        MachineFactory mf = new MachineFactory();
        Machine m = mf.produce("red");
        m.work();

    }

}
