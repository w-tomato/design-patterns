package org.bradaier.designMode.factory.abstractf;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/17
 */
public class HuaWeiFactory implements IProductFactory {

    @Override
    public IPhoneProduct phoneProduct() {
        return new HuaWeiPhone();
    }

    @Override
    public IRouterProduct routerProduct() {
        return new HuaWeiRouter();
    }

}
