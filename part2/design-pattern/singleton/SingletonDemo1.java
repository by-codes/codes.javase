/*
 * Copyright (C) 2018-2019 Banyuan All rights reserved
 */
/**
 * 单例：线程安全，调用效率高
 * @version 1.0
 * @author Yang Wen
 *
 */
public class SingletonDemo1 {
    private static SingletonDemo1 instance = new SingletonDemo1();
    private SingletonDemo1() {}
    public static SingletonDemo1 getInstance() {
        return instance;
    }
}