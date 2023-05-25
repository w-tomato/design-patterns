package org.bradaier.designpatterns.behavioral.memento;

import lombok.Data;

/**
 * @author w-tomato
 * @description 备忘录模式demo  备忘录类
 * @date 2023/5/25
 */
@Data
public class Memento {

    // 备忘录类记录玩家的分数和关卡
    private int score;
    private int level;

    public Memento(int score, int level) {
        this.score = score;
        this.level = level;
    }

}
