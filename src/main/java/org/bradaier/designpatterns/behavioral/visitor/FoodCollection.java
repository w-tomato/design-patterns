package org.bradaier.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author w-tomato
 * @description 访问者模式demo 食物集合
 * @date 2023/5/26
 */
public class FoodCollection {

    // 这个类主要的作用是方便访问者访问
    // 比如如果没有这个类，那热量访问者就需要调用三次visit方法来访问3个食物，有了这个类，直接遍历的方式替Visitor访问了
    private List<Food> foods = new ArrayList<>();

    public void addFood(Food food) {
        foods.add(food);
    }

    public void removeFood(Food food) {
        foods.remove(food);
    }

    public void accept(Visitor visitor) {
        for (Food food : foods) {
            food.accept(visitor);
        }
    }

}
