package org.bradaier.designpatterns.behavioral.state;

/**
 * @author w-tomato
 * @description  开机状态
 * @date 2023/5/25
 */
public class PowerOnState implements State{

    @Override
    public void powerOn() {
        System.out.println("已经开机了");
    }

    @Override
    public void powerOff() {
        System.out.println("关机");
    }

    @Override
    public void turnUp() {
        System.out.println("音量增加");
    }

    @Override
    public void turnDown() {
        System.out.println("音量减少");
    }
}
