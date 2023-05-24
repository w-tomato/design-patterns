package org.bradaier.designpatterns.structural.proxy;

/**
 * @author w-tomato
 * @description 代理模式demo  图片接口
 * @date 2023/5/23
 */
public class PngImage implements Image{

    private String fileName;

    public PngImage(String fileName) {
        this.fileName = fileName;
        loadImage(fileName);
    }

    @Override
    public void display() {
        System.out.println("展示图片：" + fileName);
    }

    // PNG图片需要展示,需要先加载,所以这里还有一个加载方法,但是用户不需要知道加载的过程,所以这个方法不需要暴露给用户,所以这里用private修饰
    // 虽然用户不需要知道加载的过程，却实实在在需要加载的过程，所以用代理类来代理加载的过程
    private void loadImage(String fileName) {
        System.out.println("加载图片：" + fileName);
    }

}
