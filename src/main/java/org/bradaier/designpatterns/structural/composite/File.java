package org.bradaier.designpatterns.structural.composite;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/22
 */
public class File extends AbstractFile{

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("文件名：" + name);
    }

    @Override
    public void add(AbstractFile file) {
        System.out.println("文件不支持添加");
    }


}
