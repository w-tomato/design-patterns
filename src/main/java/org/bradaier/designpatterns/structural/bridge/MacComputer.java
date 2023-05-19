package org.bradaier.designpatterns.structural.bridge;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/19
 */
public class MacComputer extends AbstractComputer {

    public MacComputer(AbstractUsb usb) {
        super(usb);
    }

    @Override
    public String readUsb() {
        return "MAC电脑" + super.readUsb();
    }
}
