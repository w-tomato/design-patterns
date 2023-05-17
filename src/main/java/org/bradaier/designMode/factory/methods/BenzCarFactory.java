package org.bradaier.designMode.factory.methods;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/16
 */
public class BenzCarFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new BenzC200();
    }
}