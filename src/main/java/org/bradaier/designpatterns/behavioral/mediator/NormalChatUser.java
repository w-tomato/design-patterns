package org.bradaier.designpatterns.behavioral.mediator;

/**
 * @author w-tomato
 * @description 中介者模式demo 普通用户类
 * @date 2023/5/25
 */
public class NormalChatUser extends AbstractChatUser{

    // 普通用户的名字
    private String userName;

    public NormalChatUser(ChatRoomInterface chatRoom, String userName) {
        super(chatRoom);
        this.userName = userName;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("普通用户" + userName + "发送消息：" + message);
        // 这里交给中介者聊天室来给其他用户发送消息
        this.chatRoom.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("普通用户" + userName + "接收到消息：" + message);
    }
}
