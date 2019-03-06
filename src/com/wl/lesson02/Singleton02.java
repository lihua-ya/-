package com.wl.lesson02;

/**
 * @autor : WL
 * date : 2019/3/4 0004
 *
 * 单例饿汉模式
 * 线程安全
 * 静态修饰的成员在类加载时执行，这时就创建一个对象
 */
public class Singleton02 {
    private static Singleton02 ourInstance = new Singleton02();

    public static Singleton02 getInstance() {
        return ourInstance;
    }

    private Singleton02() {
    }
}
