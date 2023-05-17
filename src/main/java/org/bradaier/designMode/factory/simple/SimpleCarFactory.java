package org.bradaier.designMode.factory.simple;

/**
 * @author w-tomato
 * @description 简单工厂模式 （静态工厂模式）
 * @description 优点：工厂类中包含了必要的逻辑判断，根据客户端的选择条件动态实例化相关的类，对于客户端来说，去除了与具体产品的依赖。
 * @description 缺点：工厂类的职责相对过重，增加新的产品需要修改工厂类的判断逻辑，违背了开闭原则。
 * @date 2023/5/16
 */
public class SimpleCarFactory {

    // 方式1：通过传入参数获取对应的实例
    public static Car getCar(String name) {
        if ("BenzC200".equals(name)) {
            return new BenzC200();
        } else if ("BmwMini".equals(name)) {
            return new BmwMini();
        } else {
            return null;
        }
    }

    // 方式2：通过定义静态方法
    public static Car getBenzC200() {
        return new BenzC200();
    }

    public static Car getBmwMini() {
        return new BmwMini();
    }

}
