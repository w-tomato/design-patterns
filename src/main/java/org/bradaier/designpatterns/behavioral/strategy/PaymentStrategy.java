package org.bradaier.designpatterns.behavioral.strategy;

/**
 * @author w-tomato
 * @description 策略模式demo 用于定义一系列算法，将每个算法都封装起来，并且使他们之间可以互换
 * @date 2023/5/26
 */
public interface PaymentStrategy {

    void pay();

}
