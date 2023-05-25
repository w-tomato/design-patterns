package org.bradaier.designpatterns.behavioral.iterator;

/**
 * @author w-tomato
 * @description 迭代器模式demo  迭代器接口
 * @date 2023/5/25
 */
public interface Iterator<T> {

    // 判断是否还有下一个元素
    boolean hasNext();

    // 获取下一个元素
    T next();

}
