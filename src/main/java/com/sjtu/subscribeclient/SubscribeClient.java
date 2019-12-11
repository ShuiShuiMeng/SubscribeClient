package com.sjtu.subscribeclient;

import com.alibaba.fastjson.JSONObject;
import com.sjtu.subscribeclient.request.cud.CreateReq;
import com.sjtu.subscribeclient.request.find.FindTimeReq;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeoutException;

public class SubscribeClient {

    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
        String host = "localhost";
        int port = 5672;
        String username = "guest";
        String password = "guest";

        User user = new User("test0000", "testSJTU", "test user");

        // System.out.println(rabbitConnection.getConnectMsg());

        Rabbit.connect(host, port, username, password);

        /*
        // 测试JSON转化
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("a", new Date().toString());
        map.put("b", new Date().toString());
        String msg = JSONObject.toJSONString(map);
        System.out.println(msg);
        */

        // FIND_ID
        // String msg = JSONObject.toJSONString(new FindIdReq(user.getId(), "2"));

        // FIND_TIME
        String msg = JSONObject.toJSONString(new FindTimeReq(user.getId(), "2", new Date()));

        // CREATE
        HashMap<String, String> map = new HashMap<String, String>();
        // map.put("male", "男");
        // map.put("female", "女");
        // String msg = JSONObject.toJSONString(new CreateReq(user.getId(), false,"5", "name", "epcc", "1", new ArrayList<String>(), map));

        Rabbit.sendObjRequest(msg);
        System.out.println(msg);
        int k = 0;
        while (true) {
            // System.out.println(k);
            k += 1;
            Thread.sleep(1000);
            String res = Rabbit.getOneMsg(user);
            if (res != null) {
                System.out.println(res);
                break;
            }
        }

        // Rabbit.close();

    }
}
