package org.bradaier.designpatterns.behavioral.interpreter;

/**
 * @author w-tomato
 * @description 加法表达式类
 * @date 2023/5/25
 */
public class PlusExpression implements Expression{

    // 加法是两个表达式相加，所以需要两个变量
    private Expression left;
    private Expression right;

    public PlusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public long interpret() {
        // 在这里执行加法逻辑
        return left.interpret() + right.interpret();
    }
}
