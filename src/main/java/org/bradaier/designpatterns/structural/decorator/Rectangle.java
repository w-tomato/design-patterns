package org.bradaier.designpatterns.structural.decorator;

/**
 * @author w-tomato
 * @description 矩形实现类
 * @date 2023/5/23
 */
public class Rectangle implements IShape{
    @Override
    public void draw() {
        System.out.println("画矩形");
    }
}
