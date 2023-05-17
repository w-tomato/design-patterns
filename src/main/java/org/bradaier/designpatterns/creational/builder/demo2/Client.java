package org.bradaier.designpatterns.creational.builder.demo2;

/**
 * @author w-tomato
 * @description 指挥者，指挥建造者建造产品
 * @date 2023/5/17
 */
public class Client {

    public static void main(String[] args) {
        // 不需要指挥者，直接自己指挥建造者建造产品
        Builder builder = new Builder();
        Product product = builder.buildWall("110m").buildBasic("10m").buildRoofed("30m").buildProduct();
        System.out.println(product);
    }

}
