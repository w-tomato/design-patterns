package org.bradaier.designpatterns.behavioral.visitor;

import lombok.Data;

/**
 * @author w-tomato
 * @description 访问者模式demo 蛋糕
 * @date 2023/5/26
 */
@Data
public class Cake implements Food{

    // 有价格，没热量（欺骗餐），有营养
    private int price;
    private int nutrition;

    public Cake(int price, int nutrition) {
        this.price = price;
        this.nutrition = nutrition;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
