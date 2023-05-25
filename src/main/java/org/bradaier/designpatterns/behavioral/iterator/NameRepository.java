package org.bradaier.designpatterns.behavioral.iterator;

/**
 * @author w-tomato
 * @description 迭代器模式demo  姓名库集合类
 *              实现聚合接口  并实现获取迭代器的方法
 *
 * @date 2023/5/25
 */
public class NameRepository implements Aggregate<String>{

    // 姓名数组
    private String[] names;

    public NameRepository(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator<String> iterator() {
        return new NameRepositoryIterator(names);
    }
}
