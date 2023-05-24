package org.bradaier.designpatterns.structural.proxy;

/**
 * @author w-tomato
 * @description 代理模式demo  代理类，这个代理类存在的意义就是让用户不需要关心加载的过程，只需要关心展示的过程
 * @date 2023/5/23
 */
public class ProxyImage implements Image{

    // 将实际干活的类放在代理类中，这样就可以在代理类中控制实际干活的类的行为
    private Image image;
    // 由于用户使用代理类的时候需要传入图片的路径，所以这里需要一个变量来暂存路径，并需要一个构造方法来接收路径
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new PngImage(fileName);
        }
        image.display();
    }

    public static void main(String[] args) {
        Image image = new ProxyImage("test.png");
        image.display();
    }
}
