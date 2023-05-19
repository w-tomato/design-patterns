package org.bradaier.designpatterns.structural.adapter;

/**
 * @author w-tomato
 * @description 适配器模式demo  假设消费者是一台电脑，需要插入U盘来读取数据，但是现在只有一个type-c接口，所以需要一个转接头
 * @date 2023/5/17
 */
public class Computer {

    public void readData(IAdapter adapter) {
        System.out.println("读取了数据：" + adapter.readUDisk());
    }

    public static void main(String[] args) {
        // 这样用起来  就像从右往左  U盘插入了适配器  适配器插入了电脑  就读到了数据
        new Computer().readData(new XiaoMiAdapter(new UDisk()));
    }

}
