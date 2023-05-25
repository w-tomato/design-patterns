package org.bradaier.designpatterns.behavioral.mediator;

/**
 * @author w-tomato
 * @description 中介者模式demo
 *              当然了 聊天室可以有很多种 抽象成接口
 * @date 2023/5/25
 */
public interface ChatRoomInterface {

    void sendMessage(String message, AbstractChatUser user);

}
