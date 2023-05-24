package org.bradaier.designpatterns.behavioral.chainofresponsibility;

/**
 * @author w-tomato
 * @description 责任链模式demo  抽象日志类
 * @date 2023/5/24
 */
public abstract class AbstractLogger {

    // 定义几个日志级别，用来区分日志的重要程度
    protected static int INFO = 1;
    protected static int DEBUG = 2;
    protected static int ERROR = 3;

    // 这个引用是灵魂，直接引用自己的兄弟类作为这条链上下一个干活的类，在管理类中挨个设置自己的下线，就能形成一个链
    private AbstractLogger nextLogger;
    // 这个字段记录了当前类的日志级别，用来判断当前类能不能干活
    protected int currentLevel;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    // 这里定义一个抽象的方法，让各个干活的类去实现，但真正使用的时候不是由用户自己调这个方法，而是调用下面的writeLog方法，里面有判断当前类能不能干不能干给下一个的逻辑
    public abstract void write(String message);

    public void writeLog(int level, String message) {
        // 如果不是当前级别，交给下一个干，否则调用实现的write方法记日志
        if (currentLevel != level) {
            nextLogger.writeLog(level, message);
            return;
        }
        write(message);
    }

}
