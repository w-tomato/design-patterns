package org.bradaier.designpatterns.behavioral.command;

/**
 * @author w-tomato
 * @description 后退命令
 * @date 2023/5/24
 */
public class BackwardCommand implements Command{

    private RemoteControlCar remoteControlCar;

    public BackwardCommand(RemoteControlCar remoteControlCar) {
        this.remoteControlCar = remoteControlCar;
    }

    @Override
    public void execute() {
        remoteControlCar.backward();
    }

    // 后退撤销，也就是前进
    @Override
    public void undo() {
        remoteControlCar.forward();
    }
}
