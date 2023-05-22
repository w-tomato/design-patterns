package org.bradaier.designpatterns.structural.decorator;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/23
 */
public class RedColorDecorator extends ColorDecorator{

    public RedColorDecorator(IShape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("涂成红色");
    }
}
