package org.bradaier.designpatterns.behavioral.visitor;

/**
 * @author w-tomato
 * @description 访问者模式demo 食物接口
 * @date 2023/5/26
 */
public interface Food {

    // 每种食物都要实现接收访问者的方法
    void accept(Visitor visitor);

}
