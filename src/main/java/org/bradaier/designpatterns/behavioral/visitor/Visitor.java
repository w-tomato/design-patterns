package org.bradaier.designpatterns.behavioral.visitor;

/**
 * @author w-tomato
 * @description 访问者模式demo 访问者接口
 * @date 2023/5/26
 */
public interface Visitor {

    // 系统中有几种食物，这里就要有几个方法，比如现在有米饭，可乐，蛋糕三种食物，那么这里就要有三个方法，所有的访问者都要实现这些方法
    // 所以访问者模式不好的地方就在于我要加一种食物，必然要修改所有的访问者

    void visit(Rice rice);

    void visit(Cola cola);

    void visit(Cake cake);

}
