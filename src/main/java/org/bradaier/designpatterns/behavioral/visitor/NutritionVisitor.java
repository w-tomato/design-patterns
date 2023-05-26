package org.bradaier.designpatterns.behavioral.visitor;

import lombok.Data;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/26
 */
@Data
public class NutritionVisitor implements Visitor{

    // 营养指数
    private int nutrition;

    @Override
    public void visit(Rice rice) {
        nutrition += rice.getNutrition();
    }

    @Override
    public void visit(Cola cola) {
        System.out.println("可乐不营养");
    }

    @Override
    public void visit(Cake cake) {
        nutrition += cake.getNutrition();
    }

    public String getNutrition() {
        return "总营养: " + nutrition + "分";
    }
}
