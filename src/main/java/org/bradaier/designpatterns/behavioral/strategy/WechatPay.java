package org.bradaier.designpatterns.behavioral.strategy;

/**
 * @author w-tomato
 * @description 具体策略类 微信支付
 * @date 2023/5/26
 */
public class WechatPay implements PaymentStrategy{

    private int balance;

    public WechatPay(int balance) {
        this.balance = balance;
    }

    @Override
    public void pay() {
        System.out.println("微信支付: " + balance + "元");
    }
}
