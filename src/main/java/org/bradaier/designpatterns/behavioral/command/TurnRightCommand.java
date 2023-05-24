package org.bradaier.designpatterns.behavioral.command;

/**
 * @author w-tomato
 * @description 右转命令
 * @date 2023/5/24
 */
public class TurnRightCommand implements Command{

    private RemoteControlCar remoteControlCar;

    public TurnRightCommand(RemoteControlCar remoteControlCar) {
        this.remoteControlCar = remoteControlCar;
    }

    // 右转，分为俩动作，先方向盘向右打死，然后前进
    @Override
    public void execute() {
        remoteControlCar.turnRight();
        remoteControlCar.forward();
    }

    // 撤销右转，分为俩动作，先方向盘向右打死，然后后退
    @Override
    public void undo() {
        remoteControlCar.turnRight();
        remoteControlCar.backward();
    }
}
