package org.bradaier.designpatterns.behavioral.memento;

import java.util.Stack;

/**
 * @author w-tomato
 * @description 备忘录模式demo  备忘录管理器类
 * @date 2023/5/25
 */
public class MementoManager {

    // 定义一个栈，可以保存多个备忘录，用来逐层恢复
    private Stack<Memento> mementos = new Stack<>();

    // 保存方法，需要传入玩家对象，然后调用玩家的保存方法，将生成的存档对象压入栈中
    public void save(Player player) {
        mementos.push(player.save());
    }

    // 读取存档方法，从栈中弹出一个存档对象，然后调用玩家的读取方法，将存档对象传入
    public void load(Player player) {
        player.load(mementos.pop());
    }

}
