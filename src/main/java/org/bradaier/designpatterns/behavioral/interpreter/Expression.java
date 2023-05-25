package org.bradaier.designpatterns.behavioral.interpreter;

/**
 * @author w-tomato
 * @description 解释器模式demo 抽象表达式类  然后 数字类 和 加类 和 减类  都实现这个接口
 * @date 2023/5/25
 */
public interface Expression {

    long interpret();

}
