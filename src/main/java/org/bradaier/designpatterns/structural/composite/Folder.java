package org.bradaier.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author w-tomato
 * @description 这里通过一个List属性，将File和Folder组合起来，同时由于File和Folder都继承了AbstractFile，所以可以将File和Folder统一管理
 * @date 2023/5/22
 */
public class Folder extends AbstractFile{

    private String name;
    private List<AbstractFile> files;


    public Folder(String name) {
        this.name = name;
        files = new ArrayList<>();
    }

    @Override
    public void getName() {
        System.out.println("文件夹名称：" + name);
        files.forEach(AbstractFile::getName);
    }

    @Override
    public void add(AbstractFile file) {
        files.add(file);
    }
}
