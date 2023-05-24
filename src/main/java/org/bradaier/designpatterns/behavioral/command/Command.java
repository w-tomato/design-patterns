package org.bradaier.designpatterns.behavioral.command;

/**
 * @author w-tomato
 * @description 将命令抽象成一个接口，所有命令都实现这个接口
 * @date 2023/5/24
 */
public interface Command {

    // 执行方法
    void execute();
    // 撤销方法（回退，比如前进了一步，执行undo就是后退一步）
    void undo();

}
