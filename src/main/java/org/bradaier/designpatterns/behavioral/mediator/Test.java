package org.bradaier.designpatterns.behavioral.mediator;

/**
 * @author w-tomato
 * @description
 * @date 2023/5/25
 */
public class Test {
    public static void main(String[] args) {
        // 创建聊天室
        NormalChatRoom chatRoom = new NormalChatRoom();
        // 创建用户
        AbstractChatUser user1 = new NormalChatUser(chatRoom, "张三");
        AbstractChatUser user2 = new NormalChatUser(chatRoom, "李四");
        AbstractChatUser user3 = new NormalChatUser(chatRoom, "王五");
        // 将用户加入到聊天室
        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        // 用户发送消息
        user1.sendMessage("大家好，我是张三");
        user2.sendMessage("大家好，我是李四");
        user3.sendMessage("大家好，我是王五");
    }
}
