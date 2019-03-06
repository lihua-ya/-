package com.wl.lesson03;

/**
 * @autor : WL
 * date : 2019/3/4 0004
 */
public class CarFactory {

    public static Car createCar(String brand){
        if(brand==null){
            return null;
        }
        Car car = null;
        switch (brand){
            case "奥拓":{
                car = new aotuo();
                break;
            }
            case "普尔曼":{
                car = new Pullman();
                break;
            }
            default:
                break;
        }
        return car;
    }

}
