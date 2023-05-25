package org.bradaier.designpatterns.behavioral.observer;

/**
 * @author w-tomato
 * @description 观察者模式demo   主题类
 * @date 2023/5/25
 */
public interface Subject {

    // 被观察的主题类  主要有三个方法  添加观察者  移除观察者  通知观察者
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();

}
