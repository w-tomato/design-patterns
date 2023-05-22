package org.bradaier.designpatterns.structural.decorator;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/23
 */
public class Test {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        System.out.println("------------");
        new RedColorDecorator(circle).draw();
        System.out.println("------------");
        new RedColorDecorator(new Rectangle()).draw();
    }

}
