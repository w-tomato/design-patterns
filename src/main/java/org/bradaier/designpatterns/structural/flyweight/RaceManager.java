package org.bradaier.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author w-tomato
 * @description 享元模式demo  种族管理类
 * @date 2023/5/23
 */
public class RaceManager {

    private static final Map<String, Race> raceMap = new HashMap<>();

    static {
        raceMap.put("人类", new Race("人类", "狂暴"));
        raceMap.put("精灵", new Race("精灵", "隐身"));
        raceMap.put("德鲁伊", new Race("德鲁伊", "治愈"));
    }

    // 这里是直接初始化了一些种族，实际上可以从数据库或者配置文件中读取，比如下边注释掉的代码
    public static Race getRace(String raceName) {
        return raceMap.get(raceName);
    }

    /*public static Race getRace1(String raceName) {
        if (!raceMap.containsKey(raceName)) {
            // 这里可以是查询数据库等操作 然后放到Map里以后用
            raceMap.put("human", new Race("人类", "狂暴"));
            raceMap.put("elf", new Race("精灵", "隐身"));
            raceMap.put("dryad", new Race("德鲁伊", "治愈"));
        }
        return raceMap.get(raceName);
    }*/

}
