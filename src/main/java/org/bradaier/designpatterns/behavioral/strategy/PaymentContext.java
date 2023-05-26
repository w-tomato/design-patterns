package org.bradaier.designpatterns.behavioral.strategy;

/**
 * @author w-tomato
 * @description 支付上下文
 * @date 2023/5/26
 */
public class PaymentContext {

    // 表面上看这个类可以说是完全没必要的，但是这个类的存在是为了解耦，符合迪米特法则，也就是让调用方不直接依赖具体的支付策略类
    // 同时，在这个类中也可以加入一些其他复杂逻辑，比如记录日志，比如校验等等

    private PaymentStrategy paymentStrategy;

    public void pay(){
        if (paymentStrategy == null) {
            System.out.println("请选择支付方式");
            return;
        }
        paymentStrategy.pay();
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
