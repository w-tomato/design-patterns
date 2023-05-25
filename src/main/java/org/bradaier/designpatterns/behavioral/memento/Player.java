package org.bradaier.designpatterns.behavioral.memento;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author w-tomato
 * @description 备忘录模式demo  玩家类
 * @date 2023/5/25
 */
@Data
@Accessors(chain = true)
public class Player {

    // 玩家有当前分数和关卡两个属性
    private int score;
    private int level;

    // 存档管理器保存存档，而管理器需要知道玩家的分数和关卡，所以管理器的保存方法需要传入玩家对象，玩家对象提供一个save方法根据当前状态生成存档对象交给管理器
    public Memento save() {
        return new Memento(score, level);
    }

    // 玩家的恢复方法需要传入存档对象，然后根据存档对象恢复玩家的分数和关卡
    public void load(Memento memento) {
        this.score = memento.getScore();
        this.level = memento.getLevel();
    }

    // 重写toString方法，方便打印
    @Override
    public String toString() {
        return "Player{" +
                "score=" + score +
                ", level=" + level +
                '}';
    }

}
