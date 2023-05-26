package org.bradaier.designpatterns.behavioral.visitor;

import lombok.Data;

/**
 * @author w-tomato
 * @description 访问者模式demo 米饭类
 * @date 2023/5/26
 */
@Data
public class Rice implements Food{

    // 有价格，有热量，有营养成分
    private int price;
    private int hot;
    private int nutrition;

    public Rice(int price, int hot, int nutrition) {
        this.price = price;
        this.hot = hot;
        this.nutrition = nutrition;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
