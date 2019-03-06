package com.wl.lesson02;

/**
 * @autor : WL
 * date : 2019/3/4 0004
 * 单例模式：一个类只有一个实例对象
 * 懒汉模式单例
 * 1. 私有化构造函数
 * 2. 私有化静态全局变量
 * 3. 公有静态方法
 *
 *懒汉模式单例是线程不安全的
 *
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton singleton;

    public static Singleton getSingleton(){
        if(singleton==null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
