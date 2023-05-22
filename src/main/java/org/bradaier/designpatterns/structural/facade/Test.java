package org.bradaier.designpatterns.structural.facade;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/23
 */
public class Test {

    public static void main(String[] args) {

        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawCircle();
        System.out.println("------------");
        shapeFacade.drawRectangle();
        System.out.println("------------");
        shapeFacade.drawCircleAndRectangle();

    }
}
