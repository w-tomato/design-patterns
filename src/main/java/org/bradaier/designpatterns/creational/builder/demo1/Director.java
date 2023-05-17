package org.bradaier.designpatterns.creational.builder.demo1;

/**
 * @author w-tomato
 * @description 指挥者，指挥建造者建造产品
 * @date 2023/5/17
 */
public class Director {

    // 这里这个指挥者相当于定义了一个建造者的建造过程，然后由建造者来实现这个过程，
    // 但是有些情况下不需要这个指挥者，用户可以自己指挥建造者建造产品，所以看demo2
    public Product buildProduct(Builder builder) {
        builder.buildBasic("10m");
        builder.buildWall("20m");
        builder.buildRoofed("30m");
        return builder.buildProduct();
    }

    public static void main(String[] args) {
        // 创建一个指挥者，由指挥者指挥工人建造产品
        Director director = new Director();
        Product product = director.buildProduct(new Builder());
        System.out.println(product);
    }

}
