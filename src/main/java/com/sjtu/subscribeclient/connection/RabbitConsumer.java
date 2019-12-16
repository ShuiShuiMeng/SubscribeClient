package com.sjtu.subscribeclient.connection;

import com.rabbitmq.client.GetResponse;
import com.sjtu.subscribeclient.model.user.User;

import java.io.IOException;

public class RabbitConsumer {
    /**
     * 获取一条信息
     * @return 消息字符串
     * @throws IOException 来自basicGet
     */
     public static String getOneMsg(String userName) throws IOException {
         GetResponse getResponse = RabbitConnection.channel.basicGet(userName, false);
         String msg;
         if (getResponse != null) {
             msg = new String(getResponse.getBody(), "utf-8");
             long deliveryTag = getResponse.getEnvelope().getDeliveryTag();
             RabbitConnection.channel.basicAck(deliveryTag, false);
         } else {
            msg = null;
         }
         return msg;
     }

}