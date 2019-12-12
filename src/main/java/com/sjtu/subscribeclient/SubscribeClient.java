package com.sjtu.subscribeclient;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sjtu.subscribeclient.model.request.cud.CreateReq;
import com.sjtu.subscribeclient.model.request.cud.DeleteReq;
import com.sjtu.subscribeclient.model.request.find.*;
import com.sjtu.subscribeclient.model.response.find.FindIdRes;
import com.sjtu.subscribeclient.model.user.User;
import com.sjtu.subscribeclient.model.request.find.FindTimesReq;
import com.sjtu.subscribeclient.utils.Utils;

import java.io.IOException;
import java.util.*;
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
        // String msg = JSONObject.toJSONString(new FindTimeReq(user.getId(), "2", new Date()));

        // FIND_TIMES
        // String msg = JSON.toJSONString(new FindTimesReq(user.getId(), "2", new Date(2019-1900, Calendar.DECEMBER, 11), new Date()));

        // ADD_ATTR
        // String msg = JSONObject.toJSONString(new UpdateReq(user.getId(), "2", true, "male", "male"));

        // CREATE
        // HashMap<String, String> map = new HashMap<String, String>();
        // map.put("male", "男");
        // map.put("female", "女");
        // String msg = JSONObject.toJSONString(new CreateReq(user.getId(), true,"6", "name", "epcc", "1", new ArrayList<String>(), map));

        // DELETE
        String msg = JSONObject.toJSONString(new DeleteReq(user.getId(), true, "6"));

        Rabbit.sendObjRequest(msg);
        // String msg = "{\"xx\": \"123\" , \"id\": {}}";
        // System.out.println(JSON.parseObject(msg));
        // System.out.println(JSON.parseObject(msg).getJSONObject("id"));
        int k = 0;
        while (true) {
            // System.out.println(k);
            k += 1;
            Thread.sleep(1000);
            String res = Rabbit.getOneMsg(user);
            if (res != null) {
                System.out.println(res);
                System.out.println(Utils.parseCreateRes(res).toString());
                break;
            }
        }

        // Rabbit.close();

    }
}
