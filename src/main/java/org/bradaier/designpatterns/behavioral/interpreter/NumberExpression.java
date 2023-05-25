package org.bradaier.designpatterns.behavioral.interpreter;

/**
 * @author w-tomato
 * @description 数字表达式类  数字不需要计算啥，给啥返回啥就行
 * @date 2023/5/25
 */
public class NumberExpression implements Expression{

    private String num;

    public NumberExpression(String num) {
        this.num = num;
    }

    @Override
    public long interpret() {
        return Long.valueOf(num);
    }
}
