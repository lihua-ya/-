package com.wl.lesson03;

/**
 * @autor : WL
 * date : 2019/3/4
 */
public class test {

    public static void main(String[] args) {
        Car car1 = CarFactory.createCar("奥拓");
        car1.run();
        Car car2 = CarFactory.createCar("普尔曼");
        car2.run();
    }
}
