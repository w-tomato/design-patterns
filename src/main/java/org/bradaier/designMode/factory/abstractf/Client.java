package org.bradaier.designMode.factory.abstractf;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/17
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("抽象工厂模式");
        System.out.println("小米产品");
        IProductFactory xiaomiFactory = new XiaoMiFactory();
        xiaomiFactory.phoneProduct().start();
        xiaomiFactory.routerProduct().openWifi();
        System.out.println("华为产品");
        IProductFactory huaweiFactory = new HuaWeiFactory();
        huaweiFactory.phoneProduct().start();
        huaweiFactory.routerProduct().openWifi();
    }

}
