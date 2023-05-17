package org.bradaier.designpatterns.creational.builder.demo1;

/**
 * @author w-tomato
 * @description 建造者模式中的建造者的抽象类，定义了建造者都要会建造哪些部件，然后具体的建造过程由子类实现
 * @date 2023/5/17
 */
public abstract class AbstractBuilder {

    // 建造地基
    abstract void buildBasic(String basicHeight);

    // 建造墙面
    abstract void buildWall(String wallHeight);

    // 建造屋顶
    abstract void buildRoofed(String roofedHeight);

    // 建造产品
    abstract Product buildProduct();

}
