package org.bradaier.designpatterns.creational.singleton;

/**
 * @author w-tomato
 * @description 双重检查锁模式，相比懒汉式，加了synchronized关键字，保证了线程安全，但是效率不高
 * 双重检查锁   双重检查就是两次if  锁就是synchronized
 * @date 2023/5/17
 */
public class DCL {

    private DCL () {}

    // volatile主要有俩作用 1、禁止指令重排序 2、保证内存可见性
    // 需要使用volatile来避免这种指令重排序导致的错误。
    // 参考如下情况，A、B两个线程创建单例，此时A已经赋值，但是没有完成变量初始化，而B线程看到instance已经赋值（第一次检查不为空）就拿来使用，
    // 因为instance没有完成初始化，所以使用过程中可能产生无法预料的后果。
    private static volatile DCL dcl = null;

    public static DCL getInstance() {
        // 第一次检查，如果没有这层检查，多个线程同时调用getInstance方法，都会进行同步锁的获取，这样就会造成效率低下
        if (dcl == null) {
            synchronized (DCL.class) {
                // 第二次检查，是为了防止多个线程同时通过了第一次检查，然后都进入了同步代码块，这样就会造成多次实例化
                if (dcl == null) {
                    dcl = new DCL();
                }
            }
        }
        return dcl;
    }

}
