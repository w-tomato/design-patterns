package org.bradaier.designpatterns.creational.prototype;

/**
 * @author w-tomato
 * @description 原型模式
 * 1、实现Cloneable接口
 * 2、重写clone方法
 *
 * // 需要clone这个对象的地方直接调用clone方法就可以了
 * @date 2023/5/17
 */
public class PrototypeObject implements Cloneable{

    private String name;
    private String Date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    @Override
    public PrototypeObject clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        return (PrototypeObject) clone;
    }

}
