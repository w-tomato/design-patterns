package org.bradaier.designpatterns.behavioral.visitor;

import lombok.Data;

/**
 * @author w-tomato
 * @description 访问者模式demo 访问者接口
 * @date 2023/5/26
 */
@Data
public class PriceVisitor implements Visitor{

    // 价格总数
    private int totalPrice;

    @Override
    public void visit(Rice rice) {
        totalPrice += rice.getPrice();
    }

    @Override
    public void visit(Cola cola) {
        totalPrice += cola.getPrice();
    }

    @Override
    public void visit(Cake cake) {
        totalPrice += cake.getPrice();
    }

    public String getTotalPrice() {
        return "总价格: " + totalPrice + "元";
    }
}
