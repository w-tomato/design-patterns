package org.bradaier.designpatterns.behavioral.chainofresponsibility;

/**
 * @author w-tomato
 * @description error级别的日志实现类，重点是要设置当前类所能干活的日志级别currentLevel
 * @date 2023/5/24
 */
public class ErrorLogger extends AbstractLogger{

    public ErrorLogger() {
        this.currentLevel = this.ERROR;
    }

    @Override
    public void write(String message) {
        System.out.println("记录ERROR级别日志：" + message);
    }
}
