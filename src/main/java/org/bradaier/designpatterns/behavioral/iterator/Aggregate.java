package org.bradaier.designpatterns.behavioral.iterator;

/**
 * @author w-tomato
 * @description 迭代器模式demo  聚合接口  所有的聚合类都实现这个接口
 * @date 2023/5/25
 */
public interface Aggregate<T> {

    // 获取迭代器  就是通过这个方法将聚合类和迭代器类关联起来
    Iterator<T> iterator();

}
