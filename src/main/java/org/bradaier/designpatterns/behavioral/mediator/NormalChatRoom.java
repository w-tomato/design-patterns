package org.bradaier.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author w-tomato
 * @description 中介者模式demo 中介者聊天室类
 * @date 2023/5/25
 */
public class NormalChatRoom implements ChatRoomInterface{

    private List<AbstractChatUser> userList = new ArrayList<>();

    // 添加用户到聊天室
    public void addUser(AbstractChatUser user) {
        userList.add(user);
    }

    @Override
    public void sendMessage(String message, AbstractChatUser user) {
        // 这里传入了消息和发消息的用户，遍历所有用户，除了发消息的用户，其他用户都接收到消息，这就是中介者的作用
        userList.forEach(u -> {
            if (u != user) {
                u.receiveMessage(message);
            }
        });
    }
}
