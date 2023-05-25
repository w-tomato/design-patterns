package org.bradaier.designpatterns.behavioral.interpreter;

import java.util.Stack;

/**
 * @author w-tomato
 * @description 解释器模式demo
 *              此类的作用就是接收用户输入的表达式，然后调用该调用的表达式解释类，返回给用户结果
 *
 * @date 2023/5/25
 */
public class InterpretHelper {

    // 这个demo很多的bug其实，但主要是为了演示解释器模式，所以很多数据校验啥的就不写了
    // 然后正常计算器输入肯定是  3 + 2 - 4 这样，但是为了演示这个模式实现简单，所以用了栈，
    // 所以就是 3 2 + 4 - 这样输入 栈里加入了3和2之后遇到了+号就把前两个元素pop出来用于计算
    public long interpret(String expression) {
        // 这里定义一个栈存储表达式
        Stack<Expression> stack = new Stack<>();
        String[] split = expression.split(" ");
        for (String s : split) {
            switch (s) {
                case "+":
                    // 遇到加号就把前两个元素pop出来用于计算
                    Expression left = stack.pop();
                    Expression right = stack.pop();
                    // 然后把计算结果push进去
                    stack.push(new PlusExpression(left, right));
                    break;
                case "-":
                    // 遇到减号也是把前两个元素pop出来用于计算
                    Expression right1 = stack.pop();
                    Expression left1 = stack.pop();
                    // 然后把计算结果push进去
                    stack.push(new MinusExpression(left1, right1));
                    break;
                default:
                    // 遇到数字就直接push进去
                    stack.push(new NumberExpression(s));
                    break;
            }
        }
        // 最后栈里只剩下一个元素，就是计算结果，直接返回就行
        return stack.pop().interpret();
    }

    public static void main(String[] args) {
        InterpretHelper interpretHelper = new InterpretHelper();
        long interpret = interpretHelper.interpret("3 2 + 4 -");
        System.out.println(interpret);
    }

}
