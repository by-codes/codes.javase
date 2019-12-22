/*
 * Copyright (C) 2018-2019 Banyuan All rights reserved
 */
/**
 * 动态代理
 * @version 1.0
 * @author Yang Wen
 *
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
public class MyProxyHandler implements InvocationHandler {
    private Object obj;

    public MyProxyHandler(Object obj) {
        this.obj = obj;
    }

    /**
     * 在代理实例上处理方法调用并返回结果
     *
     * @param proxy
     *            代理类
     * @param method
     *            被代理的方法
     * @param args
     *            该方法的参数数组
     */

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("====invoke======");
        System.out.println("proxy=" + proxy.getClass());
        System.out.println("method=" + method);
        Object result = null;
        System.out.println("使用动态代理事务处理前");
        //在代理实例上处理方法调用并返回结果
        result = method.invoke(obj, args);
        System.out.println("使用动态代理事务处理后");
        return result;
    }
}