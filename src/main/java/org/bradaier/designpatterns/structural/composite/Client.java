package org.bradaier.designpatterns.structural.composite;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/22
 */
public class Client {

    public static void main(String[] args) {

        AbstractFile root = new Folder("root");
        AbstractFile folder1 = new Folder("folder1");
        AbstractFile folder2 = new Folder("folder2");
        AbstractFile folder3 = new Folder("folder3");
        AbstractFile file1 = new File("file1");
        AbstractFile file2 = new File("file2");
        AbstractFile file3 = new File("file3");
        AbstractFile file4 = new File("file4");
        AbstractFile file5 = new File("file5");

        root.add(folder1);
        root.add(folder3);
        folder1.add(file1);
        folder1.add(file2);
        folder1.add(folder2);
        folder2.add(file3);
        folder2.add(file4);
        folder3.add(file5);

        root.getName();

    }

}
