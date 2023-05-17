package org.bradaier.designMode.factory.abstractf;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/17
 */
public class XiaoMiFactory implements IProductFactory {

    @Override
    public IPhoneProduct phoneProduct() {
        return new XiaoMiPhone();
    }

    @Override
    public IRouterProduct routerProduct() {
        return new XiaoMiRouter();
    }

}
