package org.bradaier.designpatterns.structural.bridge;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/19
 */
public class Client {
    public static void main(String[] args) {
        // Mac电脑读三星U盘
        MacComputer macComputer = new MacComputer(new SanXingUsb());
        System.out.println(macComputer.readUsb());

        // ThinkPad电脑读金士顿U盘
        ThinkPadComputer thinkPadComputer = new ThinkPadComputer(new JinShiDunUsb());
        System.out.println(thinkPadComputer.readUsb());
    }
}
