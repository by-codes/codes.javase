/*
 * Copyright (C) 2018-2019 Banyuan All rights reserved
 */
/**
 * 静态代理
 * @version 1.0
 * @author Yang Wen
 *
 */
public class MyStaticProxyHandler implements SayHello {

    private SayHello sh;

    public MyStaticProxyHandler(SayHello sh) {
        this.sh = sh;
    }

    @Override
    public void sayHello() {
        System.out.println("使用静态代理事务处理前");
        sh.sayHello();
        System.out.println("使用静态代理事务处理后");

    }

}