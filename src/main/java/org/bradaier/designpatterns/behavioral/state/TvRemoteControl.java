package org.bradaier.designpatterns.behavioral.state;

/**
 * @author w-tomato
 * @description 电视遥控器
 * @date 2023/5/25
 */
public class TvRemoteControl {

    // 手握状态类，用来执行操作
    private State state;

    // 初始设置为关机状态
    public TvRemoteControl() {
        this.state = new PowerOffState();
    }

    // 执行开机操作，状态设置为开机
    public void powerOn() {
        state.powerOn();
        state = new PowerOnState();
    }

    // 执行关机操作，状态设置为关机
    public void powerOff() {
        state.powerOff();
        state = new PowerOffState();
    }

    // 执行调高音量操作
    public void turnUp() {
        state.turnUp();
    }

    // 执行调低音量操作
    public void turnDown() {
        state.turnDown();
    }

}
