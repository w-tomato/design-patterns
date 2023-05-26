package org.bradaier.designpatterns.behavioral.strategy;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/26
 */
public class Test {
    public static void main(String[] args) {
        // 创建支付策略上下文，为什么要有这个上下文，具体看类里面的注释
        PaymentContext paymentContext = new PaymentContext();

        // 设置支付策略为阿里
        paymentContext.setPaymentStrategy(new AliPay(100));
        // 进行支付
        paymentContext.pay();

        // 设置支付策略为微信
        paymentContext.setPaymentStrategy(new WechatPay(200));
        // 进行支付
        paymentContext.pay();
    }
}
