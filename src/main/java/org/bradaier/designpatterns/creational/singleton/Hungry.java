package org.bradaier.designpatterns.creational.singleton;

/**
 * @author w-tomato
 * @description 饿汉式单例模式  上来直接new一个对象  线程安全
 * @date 2023/5/17
 */
public class Hungry {

    private Hungry() {}

    private static Hungry hungry = new Hungry();

    public static Hungry getInstance() {
        return hungry;
    }

}
