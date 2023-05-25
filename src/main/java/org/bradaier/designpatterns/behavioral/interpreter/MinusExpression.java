package org.bradaier.designpatterns.behavioral.interpreter;

/**
 * @author w-tomato
 * @description   减法表达式类
 * @date 2023/5/25
 */
public class MinusExpression implements Expression{

    // 减法与加法类似，两个表达式相减，所以要两个变量
    private Expression left;
    private Expression right;

    public MinusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public long interpret() {
        return left.interpret() - right.interpret();
    }
}
