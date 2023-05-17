package org.bradaier.designMode.factory.abstractf;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/17
 */
public class HuaWeiRouter implements IRouterProduct{

    @Override
    public void start() {
        System.out.println("华为路由器开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为路由器关机");
    }

    @Override
    public void openWifi() {
        System.out.println("华为路由器打开wifi");
    }

    @Override
    public void setting() {
        System.out.println("华为路由器设置");
    }
}
