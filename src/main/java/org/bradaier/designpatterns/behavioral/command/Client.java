package org.bradaier.designpatterns.behavioral.command;

/**
 * @author w-tomato
 * @description 命令模式demo  客户端
 * @date 2023/5/24
 */
public class Client {

    public static void main(String[] args) {
        CommandReceiver commandReceiver = new CommandReceiver();
        RemoteControlCar remoteControlCar = new RemoteControlCar();
        // 先前进，再左转，再右转，再后退，再左转，然后回退这些操作
        commandReceiver.doCommand(new ForwardCommand(remoteControlCar));
        commandReceiver.doCommand(new TurnLeftCommand(remoteControlCar));
        commandReceiver.doCommand(new TurnRightCommand(remoteControlCar));
        commandReceiver.doCommand(new BackwardCommand(remoteControlCar));
        commandReceiver.doCommand(new TurnLeftCommand(remoteControlCar));
        System.out.println("-----开始回退-------");
        commandReceiver.undoAllCommand();
    }

}
