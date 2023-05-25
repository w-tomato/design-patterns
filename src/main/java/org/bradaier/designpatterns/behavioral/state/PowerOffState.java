package org.bradaier.designpatterns.behavioral.state;

/**
 * @author w-tomato
 * @description 关机状态
 * @date 2023/5/25
 */
public class PowerOffState implements State{
    @Override
    public void powerOn() {
        System.out.println("开机");
    }

    @Override
    public void powerOff() {
        System.out.println("已经关机了");
    }

    @Override
    public void turnUp() {
        System.out.println("已经关机了，不能调高音量");
    }

    @Override
    public void turnDown() {
        System.out.println("已经关机了，不能调低音量");
    }
}
