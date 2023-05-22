package org.bradaier.designpatterns.structural.facade;

/**
 * @author w-tomato
 * @description 圆形实现类
 * @date 2023/5/23
 */
public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("画圆形");
    }
}
