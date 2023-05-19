package org.bradaier.designpatterns.structural.bridge;

/**
 * @author w-tomato
 * @description 桥接模式demo  抽象电脑类
 * @date 2023/5/19
 */
public class AbstractComputer {

    private AbstractUsb usb;

    public AbstractComputer (AbstractUsb usb) {
        this.usb = usb;
    }

    public String readUsb() {
        return usb.readUsb();
    }

}
