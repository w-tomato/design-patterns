package org.bradaier.designpatterns.behavioral.visitor;

import lombok.Data;

/**
 * @author w-tomato
 * @description 访问者模式demo 可乐
 * @date 2023/5/26
 */
@Data
public class Cola implements Food{

    // 有价格，有热量，没营养
    private int price;
    private int hot;

    public Cola(int price, int hot) {
        this.price = price;
        this.hot = hot;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
