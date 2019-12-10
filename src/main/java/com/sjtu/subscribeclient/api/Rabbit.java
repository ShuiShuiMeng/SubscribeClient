package com.sjtu.subscribeclient.api;


import com.rabbitmq.client.ConnectionFactory;
import com.sjtu.subscribeclient.components.RabbitConnection;
import com.sjtu.subscribeclient.components.RabbitConsumer;
import com.sjtu.subscribeclient.components.RabbitSender;
import com.sjtu.subscribeclient.entity.User;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Rabbit {

    public Rabbit() {

    }

    public static void connect(String host, int port, String username, String password) {
        try {
            RabbitConnection rabbitConnection = new RabbitConnection();
            ConnectionFactory connectionFactory = new ConnectionFactory();
            connectionFactory.setHost(host);
            connectionFactory.setPort(port);
            connectionFactory.setUsername(username);
            connectionFactory.setPassword(password);
            connectionFactory.setVirtualHost("/");
            rabbitConnection.setConnection(connectionFactory);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void close() {
        try {
            RabbitConnection rabbitConnection = new RabbitConnection();
            rabbitConnection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sendMsg(String msg, User user) {
        try {
            RabbitSender.sendMsg(msg, user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getOneMsg(User user) {
        try {
            return RabbitConsumer.getOneMsg(user);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
