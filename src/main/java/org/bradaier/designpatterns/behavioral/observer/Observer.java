package org.bradaier.designpatterns.behavioral.observer;

/**
 * @author w-tomato
 * @description 观察者模式demo   观察者接口
 * @date 2023/5/25
 */
public interface Observer {

    // 观察者主要提供一个接收通知的方法
    void update(String message);

}
