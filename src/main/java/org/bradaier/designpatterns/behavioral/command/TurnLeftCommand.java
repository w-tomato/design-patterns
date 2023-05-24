package org.bradaier.designpatterns.behavioral.command;

/**
 * @author w-tomato
 * @description 左转命令
 * @date 2023/5/24
 */
public class TurnLeftCommand implements Command{

    private RemoteControlCar remoteControlCar;

    public TurnLeftCommand(RemoteControlCar remoteControlCar) {
        this.remoteControlCar = remoteControlCar;
    }

    // 左转，分为俩动作，先方向盘向左打死，然后前进
    @Override
    public void execute() {
        remoteControlCar.turnLeft();
        remoteControlCar.forward();
    }

    // 撤销左转，分为俩动作，先方向盘向左打死，然后后退
    @Override
    public void undo() {
        remoteControlCar.turnLeft();
        remoteControlCar.backward();
    }
}
