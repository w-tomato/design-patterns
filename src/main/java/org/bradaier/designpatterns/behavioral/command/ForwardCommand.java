package org.bradaier.designpatterns.behavioral.command;

/**
 * @author w-tomato
 * @description 前进命令
 * @date 2023/5/24
 */
public class ForwardCommand implements Command{

    // 真正做动作的还得是遥控车，所以这里需要持有遥控车的引用
    private RemoteControlCar remoteControlCar;

    public ForwardCommand(RemoteControlCar remoteControlCar) {
        this.remoteControlCar = remoteControlCar;
    }

    @Override
    public void execute() {
        remoteControlCar.forward();
    }

    // 前进撤销，也就是后退
    @Override
    public void undo() {
        remoteControlCar.backward();
    }
}
