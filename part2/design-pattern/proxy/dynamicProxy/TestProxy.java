/*
/*
 * Copyright (C) 2018-2019 Banyuan All rights reserved
 */
/**
 * 动态代理
 * @version 1.0
 * @author Yang Wen
 *
 */
public class TestProxy {
    public static void main(String[] args) {
        SayHello sh = new SayHelloImpl();
        
        //使用动态代理
		MyProxyHandler mph=new MyProxyHandler(sh);
		SayHello obj=(SayHello)Proxy.newProxyInstance(sh.getClass().getClassLoader(), sh.getClass().getInterfaces(), mph);
		obj.sayHello();

    }
}
