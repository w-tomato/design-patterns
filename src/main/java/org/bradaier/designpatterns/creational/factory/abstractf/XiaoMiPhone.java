package org.bradaier.designpatterns.creational.factory.abstractf;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/17
 */
public class XiaoMiPhone implements IPhoneProduct{

    @Override
    public void start() {
        System.out.println("小米手机开机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米手机关机");
    }

    @Override
    public void callUp() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("小米手机发短信");
    }
}
