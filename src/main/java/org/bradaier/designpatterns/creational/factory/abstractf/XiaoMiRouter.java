package org.bradaier.designpatterns.creational.factory.abstractf;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/17
 */
public class XiaoMiRouter implements IRouterProduct{

    @Override
    public void start() {
        System.out.println("小米路由器开机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米路由器关机");
    }

    @Override
    public void openWifi() {
        System.out.println("小米路由器打开wifi");
    }

    @Override
    public void setting() {
        System.out.println("小米路由器设置");
    }
}
