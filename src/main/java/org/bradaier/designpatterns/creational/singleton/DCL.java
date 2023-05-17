package org.bradaier.designpatterns.creational.singleton;

/**
 * @author w-tomato
 * @description 双重检查锁模式，相比懒汉式，加了synchronized关键字，保证了线程安全，但是效率不高
 * 双重检查锁   双重检查就是两次if  锁就是synchronized
 * @date 2023/5/17
 */
public class DCL {

    private DCL () {}

    private static volatile DCL dcl = null;

    public static DCL getInstance() {
        if (dcl == null) {
            synchronized (DCL.class) {
                if (dcl == null) {
                    dcl = new DCL();
                }
            }
        }
        return dcl;
    }

}
