package org.bradaier.designpatterns.behavioral.template;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/26
 */
public class Test {

    public static void main(String[] args) {
        // 制作拿铁咖啡
        MakeCoffee makeLatteCoffee = new MakeLatteCoffee();
        makeLatteCoffee.makeCoffee();

        System.out.println("=====================================");

        // 制作美式咖啡
        MakeCoffee makeAmericanoCoffee = new MakeAmericanoCoffee();
        makeAmericanoCoffee.makeCoffee();
    }

}
