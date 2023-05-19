package org.bradaier.designpatterns.structural.bridge;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/19
 */
public class SanXingUsb extends AbstractUsb {

    @Override
    public String readUsb() {
        return "读取三星U盘数据";
    }
}
