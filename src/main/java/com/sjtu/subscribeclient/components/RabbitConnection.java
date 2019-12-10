package com.sjtu.subscribeclient.components;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;


public class RabbitConnection {
    static Channel channel;
    private static Connection connection;

    public RabbitConnection() {
        channel = null;
        connection = null;
    }

    public String getConnectMsg() {
        if (connection != null) return connection.toString();
        return "none connection";
    }

    public void setConnection(ConnectionFactory connectionFactory) throws IOException, TimeoutException {
        connection = connectionFactory.newConnection();
        channel = connection.createChannel();
    }

    public void close() throws IOException, TimeoutException {
        channel.close();
        connection.close();
    }

}
