package org.bradaier.designpatterns.creational.builder.demo2;

/**
 * @author w-tomato
 * @description 建造者模式最终要建造的产品
 * @date 2023/5/17
 */
public class Product {

    private String basic;
    private String wall;
    private String roofed;

    public String getBasic() {
        return basic;
    }

    public Product setBasic(String basic) {
        this.basic = basic;
        return this;
    }

    public String getWall() {
        return wall;
    }

    public Product setWall(String wall) {
        this.wall = wall;
        return this;
    }

    public String getRoofed() {
        return roofed;
    }

    public Product setRoofed(String roofed) {
        this.roofed = roofed;
        return this;
    }

    @Override
    public String toString() {
        return "Product{" +
                "basic='" + basic + '\'' +
                ", wall='" + wall + '\'' +
                ", roofed='" + roofed + '\'' +
                '}';
    }
}
