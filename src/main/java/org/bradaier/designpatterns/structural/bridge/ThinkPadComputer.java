package org.bradaier.designpatterns.structural.bridge;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/19
 */
public class ThinkPadComputer extends AbstractComputer {

    public ThinkPadComputer(AbstractUsb usb) {
        super(usb);
    }

    @Override
    public String readUsb() {
        return "ThinkPad电脑" + super.readUsb();
    }
}
