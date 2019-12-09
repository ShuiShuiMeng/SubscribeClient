package com.sjtu.subscribeclient.api;


import com.rabbitmq.client.ConnectionFactory;
import com.sjtu.subscribeclient.components.RabbitConnection;
import com.sjtu.subscribeclient.components.RabbitConsumer;
import com.sjtu.subscribeclient.components.RabbitSender;
import com.sjtu.subscribeclient.entity.User;

import java.io.IOException;

public class Rabbit {

    public Rabbit() {

    }

    public static RabbitConnection connect(String host, int port, String username, String password) {
        try {
            // System.out.println("connecting....");
            RabbitConnection rabbitConnection = new RabbitConnection();
            ConnectionFactory connectionFactory = new ConnectionFactory();
            connectionFactory.setHost(host);
            connectionFactory.setPort(port);
            connectionFactory.setUsername(username);
            connectionFactory.setPassword(password);
            connectionFactory.setVirtualHost("/");
            rabbitConnection.setConnection(connectionFactory);
            return rabbitConnection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void sendMsg(String msg, User user) throws IOException {
        RabbitSender.sendMsg(msg, user);
    }

    public static String getOneMsg(User user) throws IOException {
        return RabbitConsumer.getOneMsg(user);
    }

}
