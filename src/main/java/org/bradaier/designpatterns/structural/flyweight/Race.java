package org.bradaier.designpatterns.structural.flyweight;

import lombok.Data;

/**
 * @author w-tomato
 * @description 享元模式demo  种族类
 * @date 2023/5/23
 */
@Data
public class Race {

    private String name;

    private String skill;

    public Race (String name, String skill) {
        this.name = name;
        this.skill = skill;
    }

}
