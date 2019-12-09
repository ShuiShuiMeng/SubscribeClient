package com.sjtu.subscribeclient;

import com.sjtu.subscribeclient.api.Rabbit;
import com.sjtu.subscribeclient.components.RabbitConnection;
import com.sjtu.subscribeclient.entity.User;

public class SubscribeClient {

    public static void main(String[] args) {
        String host = "localhost";
        int port = 5672;
        String username = "guest";
        String password = "guest";

        User user = new User("test0000", "testSJTU", "test user");
        RabbitConnection rabbitConnection = Rabbit.connect(host, port, username, password);
        // System.out.println(rabbitConnection.getConnectMsg());

        try {
            // Rabbit.sendMsg("1234");
            // Rabbit.sendMsg("5678");
            System.out.println(Rabbit.getOneMsg(user));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
