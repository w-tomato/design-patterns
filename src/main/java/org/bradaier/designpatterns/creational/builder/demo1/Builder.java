package org.bradaier.designpatterns.creational.builder.demo1;

/**
 * @author w-tomato
 * @description 建造者类，实现了抽象建造者类，负责具体的建造过程
 *             写的时候发现个缺点，比如我buildBasic()方法中需要传入参数，那么我就需要在抽象建造者类中定义一个参数，然后在子类中实现
 *             但是如果又新建一个建造者类需要另外的参数，那就需要修改抽象类，修改了抽象类就需要修改所有的子类，这样就违背了开闭原则
 *             总之不适合会新增建造者或者新增产品参数的情况
 * @date 2023/5/17
 */
public class Builder extends AbstractBuilder {

    private Product product;

    public Builder() {
        product = new Product();
    }

    @Override
    void buildBasic(String basicHeight) {
        product.setBasic(basicHeight);
    }

    @Override
    void buildWall(String wallHeight) {
        product.setWall(wallHeight);
    }

    @Override
    void buildRoofed(String roofedHeight) {
        product.setRoofed(roofedHeight);
    }

    @Override
    Product buildProduct() {
        return product;
    }
}
