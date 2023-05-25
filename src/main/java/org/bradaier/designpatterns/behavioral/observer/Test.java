package org.bradaier.designpatterns.behavioral.observer;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/25
 */
public class Test {

    public static void main(String[] args) {
        // 创建一个被观察的主题
        WeatherSubject weatherSubject = new WeatherSubject();

        // 创建三个天气观察者
        Observer observer1 = new WeatherObserver("观察者1");
        Observer observer2 = new WeatherObserver("观察者2");
        Observer observer3 = new WeatherObserver("观察者3");

        // 注册观察者
        weatherSubject.addObserver(observer1);
        weatherSubject.addObserver(observer2);
        weatherSubject.addObserver(observer3);

        // 天气变化
        weatherSubject.setMessage("天气晴朗");

        // 移除观察者2
        weatherSubject.removeObserver(observer2);

        // 天气变化
        weatherSubject.setMessage("天气多云");
    }
}
