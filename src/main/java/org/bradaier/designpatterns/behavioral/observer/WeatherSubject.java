package org.bradaier.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author w-tomato
 * @description 观察者模式demo   被观察的主题实现类
 * @date 2023/5/25
 */
public class WeatherSubject implements Subject {

    // 被观察的主题类需要知道如果发生数据变化需要通知哪些观察者，所以这里维护一个列表保存观察者们
    private List<Observer> observers = new ArrayList<>();
    // 还需要保存一个数据，这里假设是天气信息， 消息发生变化时，通知所有观察者
    private String message;

    public void setMessage(String message) {
        this.message = message;
        // 数据发生变化时，通知所有观察者
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this.message);
        }
    }
}
