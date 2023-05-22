package org.bradaier.designpatterns.structural.facade;

/**
 * @author w-tomato
 * @description 这个属实没啥意思，就是加了一层，虽然说挺实用，但是缺点很明显，就是如果有新的图形，就要修改这个类，违反了开闭原则，业务越来越复杂就会越来越臃肿
 * @date 2023/5/23
 */
public class ShapeFacade {

    private Circle circle;
    private Rectangle rectangle;

    public ShapeFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawCircleAndRectangle(){
        circle.draw();
        rectangle.draw();
    }

}
