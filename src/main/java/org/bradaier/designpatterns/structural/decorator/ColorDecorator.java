package org.bradaier.designpatterns.structural.decorator;

/**
 * @author w-tomato
 * @description 装饰器模式demo
 *              将颜色这个装饰器抽象出来，目的是可以有多个颜色的装饰器，比如红色装饰器，蓝色装饰器，绿色装饰器等等
 *              同时实现形状接口，这样逼迫装饰器也要实现形状接口，这样装饰器也可以被装饰了，这就是装饰器模式的精髓
 *              比如笔记中说的咖啡，可以加个糖，可以加个奶，可以加个蜂蜜，可以搞连环装饰
 * @date 2023/5/23
 */
public abstract class ColorDecorator implements IShape{

    // 被装饰的形状 将形状或装饰器作为变量传入，这样就可以使用形状的方法了
    private IShape shape;

    public ColorDecorator(IShape shape) {
        this.shape = shape;
    }

    public void draw(){
        shape.draw();
    }

}
