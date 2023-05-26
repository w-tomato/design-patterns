package org.bradaier.designpatterns.behavioral.template;

/**
 * @author w-tomato
 * @description 模板方法模式demo 制作美式咖啡
 * @date 2023/5/26
 */
public class MakeAmericanoCoffee extends MakeCoffee{

    @Override
    public void brew() {
        System.out.println("冲泡美式咖啡");
    }

    @Override
    public void addCondiments() {
        System.out.println("加入糖");
    }
}
