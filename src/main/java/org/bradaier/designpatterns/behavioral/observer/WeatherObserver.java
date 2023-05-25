package org.bradaier.designpatterns.behavioral.observer;

/**
 * @author w-tomato
 * @description 观察者模式demo   天气观察者实现类
 * @date 2023/5/25
 */
public class WeatherObserver implements Observer{

    private String name;

    public WeatherObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(this.name + "收到天气信息：" + message);
    }
}
