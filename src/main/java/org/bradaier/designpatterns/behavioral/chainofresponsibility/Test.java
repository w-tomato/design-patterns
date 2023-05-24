package org.bradaier.designpatterns.behavioral.chainofresponsibility;

import lombok.extern.java.Log;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/24
 */
public class Test {

    public static void main(String[] args) {
        LoggerHelper.writeLog(AbstractLogger.INFO, "这是一条info级别的日志");
        LoggerHelper.writeLog(AbstractLogger.DEBUG, "这是一条debug级别的日志");
        LoggerHelper.writeLog(AbstractLogger.ERROR, "这是一条error级别的日志");
    }

}
