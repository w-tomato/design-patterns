package org.bradaier.designMode.factory.abstractf;

/**
 * @author w-tomato
 * @description 抽象产品工厂 所有的工厂都要实现这个接口
 * 抽象工厂模式的抽象主要体现在工厂
 *
 * @date 2023/5/17
 */
public interface IProductFactory {

    IPhoneProduct phoneProduct();

    IRouterProduct routerProduct();

}
