package org.bradaier.designpatterns.creational.factory.methods;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/16
 */
public class BmwMini implements Car {

    @Override
    public void getName() {
        System.out.println("宝马迷你");
    }
}
