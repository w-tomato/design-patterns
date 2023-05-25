package org.bradaier.designpatterns.behavioral.mediator;

/**
 * @author w-tomato
 * @description 中介者模式demo 抽象聊天用户类
 * @date 2023/5/25
 */
public abstract class AbstractChatUser {

    // 所有用户都手握中介者  也就是聊天室
    protected ChatRoomInterface chatRoom;

    public AbstractChatUser(ChatRoomInterface chatRoom) {
        this.chatRoom = chatRoom;
    }

    // 所有用户都要有发送消息的方法和接收消息的方法 但是具体实现不一样  所以抽象出来
    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);

}
