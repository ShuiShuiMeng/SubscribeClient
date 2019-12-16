package com.sjtu.subscribeclient;


import com.rabbitmq.client.ConnectionFactory;
import com.sjtu.subscribeclient.connection.RabbitConnection;
import com.sjtu.subscribeclient.connection.RabbitConsumer;
import com.sjtu.subscribeclient.connection.RabbitSender;
import com.sjtu.subscribeclient.model.user.User;

public class Rabbit {

    public Rabbit() {

    }

    public static void connect(String host, int port) {
        try {
            RabbitConnection rabbitConnection = new RabbitConnection();
            ConnectionFactory connectionFactory = new ConnectionFactory();
            connectionFactory.setHost(host);
            connectionFactory.setPort(port);
            connectionFactory.setUsername("guest");
            connectionFactory.setPassword("guest");
            connectionFactory.setVirtualHost("/");
            rabbitConnection.setConnection(connectionFactory);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void close() {
        try {
            RabbitConnection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sendObjRequest(String msg) {
        try {
            RabbitSender.sendObjRequest(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sendSubRequest(String msg) {
        try {
            RabbitSender.sendSubRequest(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getOneMsg(String userName) {
        try {
            return RabbitConsumer.getOneMsg(userName);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
