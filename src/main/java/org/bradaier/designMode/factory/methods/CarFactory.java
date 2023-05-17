package org.bradaier.designMode.factory.methods;

/**
 * @author w-tomato
 * @description 工厂方法模式  这样相比于简单工厂模式，好处是可以在满足开闭原则的情况下扩展，但是每次都要创建一个工厂类，比较麻烦，代码量大
 * 所以根据设计原则，工厂方法模式适用于创建对象数量较少的情况
 * 但是实际使用中，一般都是使用简单工厂模式，因为创建对象的数量一般都是很多的
 * @date 2023/5/16
 */
public interface CarFactory {

    Car getCar();

}
