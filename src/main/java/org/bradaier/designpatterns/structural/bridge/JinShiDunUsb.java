package org.bradaier.designpatterns.structural.bridge;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/19
 */
public class JinShiDunUsb extends AbstractUsb{
    @Override
    public String readUsb() {
        return "读取金士顿U盘数据";
    }
}
