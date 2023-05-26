package org.bradaier.designpatterns.behavioral.template;

/**
 * @author w-tomato
 * @description 模板方法模式demo 制作拿铁咖啡
 * @date 2023/5/26
 */
public class MakeLatteCoffee extends MakeCoffee{

    @Override
    public void brew() {
        System.out.println("冲泡拿铁咖啡");
    }

    @Override
    public void addCondiments() {
        System.out.println("加入牛奶");
    }
}
