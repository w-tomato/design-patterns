package org.bradaier.designMode.factory.abstractf;

/**
 * @author w-tomato
 * @description 路由器产品接口
 * @date 2023/5/17
 */
public interface IRouterProduct {

    void start();

    void shutdown();

    void openWifi();

    void setting();

}
