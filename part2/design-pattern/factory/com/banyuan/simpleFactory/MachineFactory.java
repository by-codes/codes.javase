/*
 * Copyright (C) 2018-2019 Banyuan All rights reserved
 */
/**
 * 简单工厂,场景：用户需要机器来生产布，
 * 但因为布有不同种类，所以需要不同的机器。工厂负责把这些机器生产出来。
 * 分析：对于机器来说，有一个共同的功能，就是work，这是接口；
 * RedMachine只能生产红色的布，BlueMachine只能生产蓝色的布。
 * @version 1.0
 * @author Yang Wen
 *
 */
package com.banyuan.simpleFactory;
public class MachineFactory {
    public Machine produce(String types) {
        if ("red".equals(types)) {
            return new RedMachine();
        } else {
            return new BlueMachine();
        }
    }
}
