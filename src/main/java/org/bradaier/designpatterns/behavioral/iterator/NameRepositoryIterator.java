package org.bradaier.designpatterns.behavioral.iterator;

/**
 * @author w-tomato
 * @description   迭代器模式demo  姓名库迭代器类
 * @date 2023/5/25
 */
public class NameRepositoryIterator implements Iterator<String>{

    // 迭代器主要有俩东西，一个集合用于存储数据，一个指针用于指向当前的位置
    private String[] names;
    private int index;

    public NameRepositoryIterator(String[] names) {
        this.names = names;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < names.length;
    }

    @Override
    public String next() {
        // 这块就是迭代器的核心逻辑，判断是否还有下一个元素，如果有就按照一定的规则获取下一个元素
        // 比如这个例子就是最简单的数组，按照index的顺序获取下一个元素，如果是链表，就是获取下一个节点等等
        if (!hasNext()) {
            throw new RuntimeException("没有下一个元素了");
        }
        String name = names[index];
        index++;
        return name;
    }
}
