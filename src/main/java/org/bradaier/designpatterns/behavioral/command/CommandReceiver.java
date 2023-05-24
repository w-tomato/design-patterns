package org.bradaier.designpatterns.behavioral.command;

import java.util.Stack;

/**
 * @author w-tomato
 * @description 命令接收类
 * @date 2023/5/24
 */
public class CommandReceiver {

    // 这里为了实回退功能，需要用栈来记录命令的执行顺序
    private static Stack<Command> commandStack = new Stack<>();

    // 执行命令，然后将命令压入栈中
    public void doCommand(Command command) {
        command.execute();
        commandStack.push(command);
    }

    // 回退所有命令，从栈中逐个弹出命令，然后执行命令的撤销方法
    public void undoAllCommand() {
        while (!commandStack.isEmpty()) {
            Command command = commandStack.pop();
            command.undo();
        }
    }

}
