package org.bradaier.designMode.factory.methods;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/16
 */
public class Consumer {

    public static void main(String[] args) {
        Car car = new BenzCarFactory().getCar();
        Car car1 = new BmwCarFactory().getCar();
        car.getName();
        car1.getName();
    }

}
