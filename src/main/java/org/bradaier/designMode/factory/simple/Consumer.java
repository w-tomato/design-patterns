package org.bradaier.designMode.factory.simple;

/**
 * @author w-tomato
 * @description 工厂模式消费者
 * @date 2023/5/16
 */
public class Consumer {

    // 简单工厂模式消费
    public static void main(String[] args) {
        Car car1 = SimpleCarFactory.getCar("BenzC200");
        Car car2 = SimpleCarFactory.getCar("BmwMini");
        car1.getName();
        car2.getName();
    }



}
