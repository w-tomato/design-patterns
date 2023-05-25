package org.bradaier.designpatterns.behavioral.iterator;

/**
 * @author w-tomato
 * @description 迭代器模式demo  测试类
 * @date 2023/5/25
 */
public class Test {

    public static void main(String[] args) {

        String[] names = {"张三", "李四", "王五", "赵六"};
        NameRepository nameRepository = new NameRepository(names);
        // 获取迭代器
        Iterator<String> iterator = nameRepository.iterator();
        // 使用迭代器遍历集合
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

    }

}
