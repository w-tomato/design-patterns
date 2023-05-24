package org.bradaier.designpatterns.behavioral.chainofresponsibility;

/**
 * @author w-tomato
 * @description 责任链模式demo，日志类，建立各级别日志实现类的上下级链接关系，并提供统一的方法供用户使用
 * @date 2023/5/24
 */
public class LoggerHelper {

    private static AbstractLogger loggerChain;

    static {
        AbstractLogger infoLogger = new InfoLogger();
        AbstractLogger debugLogger = new DebugLogger();
        AbstractLogger errorLogger = new ErrorLogger();
        // 从头到尾连起来
        loggerChain = infoLogger;
        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);
    }

    public static void writeLog(int level, String message) {
        loggerChain.writeLog(level, message);
    }

}
