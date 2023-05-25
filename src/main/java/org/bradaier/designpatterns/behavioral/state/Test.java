package org.bradaier.designpatterns.behavioral.state;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/25
 */
public class Test {
    public static void main(String[] args) {
        TvRemoteControl tvRemoteControl = new TvRemoteControl();
        tvRemoteControl.powerOn();
        tvRemoteControl.turnUp();
        tvRemoteControl.turnUp();
        tvRemoteControl.turnDown();
        tvRemoteControl.powerOff();
        tvRemoteControl.turnUp();
        tvRemoteControl.turnDown();
    }
}
