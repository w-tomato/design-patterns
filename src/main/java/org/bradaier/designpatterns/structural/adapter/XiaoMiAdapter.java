package org.bradaier.designpatterns.structural.adapter;

/**
 * @author w-tomato
 * @description 适配器  实现了IAdapter接口  里面有一个U盘对象 通过构造方法传入
 * 在本例中，电脑想读取USB数据，所以需要一个小米适配器，这个适配器定义了一个USB成员变量，然后在构造方法中传入一个USB对象，适配器就有了USB的功能，
 * 然后当电脑想用USB的时候就用这个适配器，这样就串联了起来，当然适配器可以有很多种，所以这里定义了一个适配器接口，然后不同的适配器实现这个接口就可以了
 * @date 2023/5/17
 */
public class XiaoMiAdapter implements IAdapter{

    private UDisk uDisk;

    // 通过构造方法传入U盘对象 这里也可以把U盘对象改成接口 传入不同的U盘对象 就更加灵活了
    public XiaoMiAdapter(UDisk uDisk) {
        this.uDisk = uDisk;
    }

    @Override
    public String readUDisk() {
        return uDisk.exportData();
    }
}
