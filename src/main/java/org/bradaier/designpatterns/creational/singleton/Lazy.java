package org.bradaier.designpatterns.creational.singleton;

/**
 * @author w-tomato
 * @description 懒汉式 相比原饿汉式 就是在获取实例的时候才去创建实例 有点是没人用的时候不new不浪费空间 缺点是造成了线程不安全
 * @date 2023/5/17
 */
public class Lazy {

    private Lazy () {}

    private static Lazy lazy = null;

    public static Lazy getInstance() {
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }

}
