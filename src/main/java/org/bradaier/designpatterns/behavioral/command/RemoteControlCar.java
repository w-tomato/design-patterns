package org.bradaier.designpatterns.behavioral.command;

/**
 * @author w-tomato
 * @description 命令模式demo  遥控车类
 * @date 2023/5/24
 */
public class RemoteControlCar {

    // 遥控车有四个基础动作，分别是前进、后退、左转、右转
    public void forward() {
        System.out.println("遥控车前进");
    }

    public void backward() {
        System.out.println("遥控车后退");
    }

    public void turnLeft() {
        System.out.println("遥控车向左打方向盘");
    }

    public void turnRight() {
        System.out.println("遥控车向右打方向盘");
    }

}
