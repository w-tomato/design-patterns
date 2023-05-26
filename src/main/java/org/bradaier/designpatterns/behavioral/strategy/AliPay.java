package org.bradaier.designpatterns.behavioral.strategy;

/**
 * @author w-tomato
 * @description 具体策略类 支付宝支付
 * @date 2023/5/26
 */
public class AliPay implements PaymentStrategy {

    private int balance;

    public AliPay(int balance) {
        this.balance = balance;
    }

    @Override
    public void pay() {
        System.out.println("支付宝支付: " + balance + "元");
    }
}
