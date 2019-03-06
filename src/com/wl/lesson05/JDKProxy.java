package com.wl.lesson05;

/**
 * @autor : WL;
 * @date : 2019/3/4 0004
 */
public class JDKProxy implements InvocationHandler{
    private Object tarjet;

    public JDKProxy(Object tarjet) {
        this.tarjet = tarjet;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是房产中介.....开始监听你买房啦!");
        Object oj = method.invoke(tarjet, args);
        System.out.println("我是房产中介.....结束监听你买房啦!");
        return oj;

    }
}
