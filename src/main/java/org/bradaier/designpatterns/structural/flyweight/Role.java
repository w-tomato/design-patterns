package org.bradaier.designpatterns.structural.flyweight;

import lombok.Data;

/**
 * @author w-tomato
 * @description 享元模式demo  角色类
 * @date 2023/5/23
 */
@Data
public class Role {

    private String playerName;

    private String roleHeight;

    private Race race;

    public Role (String playerName, String roleHeight, String raceName) {
        this.playerName = playerName;
        this.roleHeight = roleHeight;
        this.race = RaceManager.getRace(raceName);
    }
}
