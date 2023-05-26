package org.bradaier.designpatterns.behavioral.visitor;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/26
 */
public class Test {

    public static void main(String[] args) {
        // 先创建3个食物  实际应用中可以是从数据库查出来的
        Rice rice = new Rice(10, 100, 20);
        Cola cola = new Cola(5, 200);
        Cake cake = new Cake(20, 30);

        // 创建食物集合方便访问者访问
        FoodCollection foodCollection = new FoodCollection();
        foodCollection.addFood(rice);
        foodCollection.addFood(cola);
        foodCollection.addFood(cake);

        // 创建价格计算访问者
        PriceVisitor priceVisitor = new PriceVisitor();
        foodCollection.accept(priceVisitor);
        System.out.println(priceVisitor.getTotalPrice());

        // 创建营养计算访问者
        NutritionVisitor nutritionVisitor = new NutritionVisitor();
        foodCollection.accept(nutritionVisitor);
        System.out.println(nutritionVisitor.getNutrition());

        // 创建热量计算访问者
        HotVisitor hotVisitor = new HotVisitor();
        foodCollection.accept(hotVisitor);
        System.out.println(hotVisitor.getTotalEnergy());

    }

}
