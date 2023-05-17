package org.bradaier.designpatterns.creational.factory.methods;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/16
 */
public class BmwCarFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new BmwMini();
    }
}
