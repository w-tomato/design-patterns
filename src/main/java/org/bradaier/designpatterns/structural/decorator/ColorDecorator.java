package org.bradaier.designpatterns.structural.decorator;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/23
 */
public abstract class ColorDecorator implements IShape{

    private IShape shape;

    public ColorDecorator(IShape shape) {
        this.shape = shape;
    }

    public void draw(){
        shape.draw();
    }

}
