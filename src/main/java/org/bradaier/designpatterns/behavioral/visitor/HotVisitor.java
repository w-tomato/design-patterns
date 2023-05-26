package org.bradaier.designpatterns.behavioral.visitor;

import lombok.Data;

/**
 * @author w-tomato
 * @description 访问者模式demo 热量访问者
 * @date 2023/5/26
 */
@Data
public class HotVisitor implements Visitor{

    // 热量总数
    private int totalEnergy;

    @Override
    public void visit(Rice rice) {
       totalEnergy += rice.getHot();
    }

    @Override
    public void visit(Cola cola) {
        totalEnergy += cola.getHot();
    }

    @Override
    public void visit(Cake cake) {
        System.out.println("蛋糕怎么可能有热量呢，蛋糕是减肥餐");
    }

    public String getTotalEnergy() {
        return "总热量: " + totalEnergy + "千卡";
    }
}
