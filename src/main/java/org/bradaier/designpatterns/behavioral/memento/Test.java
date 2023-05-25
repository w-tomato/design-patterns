package org.bradaier.designpatterns.behavioral.memento;

/**
 * @author w-tomato
 * @description 备忘录模式demo  备忘录管理器类
 * @date 2023/5/25
 */
public class Test {

    public static void main(String[] args) {
        // 创建一个玩家
        Player player = new Player();
        // 创建一个存档管理器
        MementoManager mementoManager = new MementoManager();

        // 假设玩家玩到了第一关， 100分，然后保存一下
        player.setScore(100).setLevel(1);
        mementoManager.save(player);

        // 玩到了第二关， 200分，然后保存一下
        player.setScore(200).setLevel(2);
        mementoManager.save(player);

        // 玩到了第三关， 300分，然后保存一下
        player.setScore(300).setLevel(3);
        System.out.println("当前玩家信息：" + player);

        // 现在恢复到上一个存档
        mementoManager.load(player);
        System.out.println("已恢复到上一个存档：" + player);

        // 再恢复一下
        mementoManager.load(player);
        System.out.println("已恢复到上一个存档：" + player);

    }

}
