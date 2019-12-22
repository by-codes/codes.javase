/*
 * Copyright (C) 2018-2019 Banyuan All rights reserved
 */
/**
 * 静态代理
 * @version 1.0
 * @author Yang Wen
 *
 */
public class TestProxy {
    public static void main(String[] args) {
        SayHello sh = new SayHelloImpl();
        //使用静态代理
        MyStaticProxyHandler msph = new MyStaticProxyHandler(sh);
        msph.sayHello();

    }
}
