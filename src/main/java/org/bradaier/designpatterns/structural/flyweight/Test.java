package org.bradaier.designpatterns.structural.flyweight;

import java.sql.SQLOutput;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/24
 */
public class Test {

    public static void main(String[] args) {

        // 玩家创建角色，输入姓名，身高，种族名称，就可以获得角色对象，角色对象中包含种族对象，这个种族对象是共享的，无论有多少个玩家，都是共享的，就节省了内存空间
        Role role = new Role("张三", "180cm", "人类");
        System.out.println("种族技能：" + role.getRace().getSkill());

    }

}
