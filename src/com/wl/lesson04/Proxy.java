package com.wl.lesson04;

/**
 * @autor : WL;
 * @date : 2019/3/4 0004
 */
public class Proxy implements Hose {

    private XiaoMing xiaoming;
    public Proxy(XiaoMing xiaoming){
        this.xiaoming=xiaoming;
    }

    @Override
    public void mai() {
        System.out.println("我是中介 看你买房开始啦!");
        xiaoming.mai();
        System.out.println("我是中介 看你买房结束啦!");
    }
}
