package org.bradaier.designpatterns.behavioral.template;

/**
 * @author w-tomato
 * @description 模板方法模式demo 制作咖啡模版抽象类
 * @date 2023/5/26
 */
public abstract class MakeCoffee {

    // 这里使用final修饰，是为了防止子类重写，将算法框架固定下来
    public final void makeCoffee() {
        // 1. 烧水
        boilWater();
        // 2. 冲泡
        brew();
        // 3. 倒入杯中
        pourInCup();
        // 4. 加入调料
        addCondiments();
    }

    // 烧水  这一步直接基类实现了  因为不管啥咖啡烧水这一步都一样
    public void boilWater() {
        System.out.println("烧水");
    }

    // 冲泡  这一步由子类实现  因为不同的咖啡冲泡的方式不一样
    public abstract void brew();

    // 倒入杯中  这一步直接基类实现了  因为不管啥咖啡倒入杯中这一步都一样
    public void pourInCup() {
        System.out.println("倒入杯中");
    }

    // 加入调料  这一步由子类实现  因为不同的咖啡加入的调料不一样
    public abstract void addCondiments();
}
