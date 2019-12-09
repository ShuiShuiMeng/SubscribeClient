package com.sjtu.subscribeclient.components;

import com.sjtu.subscribeclient.common.Constants;
import com.sjtu.subscribeclient.entity.User;

import java.io.IOException;

public class RabbitSender {
    public static void sendMsg(String msg, User user) throws IOException {
        RabbitConnection.channel.basicPublish(Constants.SEND_EXCHANGE , user.getId(), null, msg.getBytes("utf-8"));
    }
}
