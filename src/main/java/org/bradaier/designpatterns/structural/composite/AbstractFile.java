package org.bradaier.designpatterns.structural.composite;

import java.util.List;

/**
 * @author w-tomato
 * @description 组合模式demo  抽象文件类   文件和文件夹都继承这个类，这样就可以实现文件和文件夹的统一管理
 * @date 2023/5/22
 */
public abstract class AbstractFile {
    public abstract void getName();
    public abstract void add(AbstractFile file);
}
