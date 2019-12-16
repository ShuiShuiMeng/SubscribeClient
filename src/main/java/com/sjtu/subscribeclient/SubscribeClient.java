package com.sjtu.subscribeclient;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sjtu.subscribeclient.model.request.cud.CreateReq;
import com.sjtu.subscribeclient.model.request.cud.DeleteReq;
import com.sjtu.subscribeclient.model.request.find.FindIdReq;
import com.sjtu.subscribeclient.model.request.find.FindNodeEventReq;
import com.sjtu.subscribeclient.model.request.register.RegisterReq;
import com.sjtu.subscribeclient.model.request.register.UnregisterReq;
import com.sjtu.subscribeclient.model.request.subscribe.SubAttributeReq;
import com.sjtu.subscribeclient.model.request.subscribe.SubObjectReq;
import com.sjtu.subscribeclient.model.request.subscribe.SubTemplateReq;
import com.sjtu.subscribeclient.model.response.subscribe.SubObjectRes;
import com.sjtu.subscribeclient.model.response.subscribe.SubTemplateRes;
import com.sjtu.subscribeclient.model.user.User;
import com.sjtu.subscribeclient.model.request.find.FindTimesReq;
import com.sjtu.subscribeclient.utils.parseRes;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeoutException;

public class SubscribeClient {

    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
        String host = "localhost";
        int port = 5672;
        String username = "guest";
        String password = "guest";

        User user = new User("1", "yinmeng", "wangchongyang de baba");

        // System.out.println(rabbitConnection.getConnectMsg());

        Rabbit.connect(host, port);

        /*
        // 测试JSON转化
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("a", new Date().toString());
        map.put("b", new Date().toString());
        String msg = JSONObject.toJSONString(map);
        System.out.println(msg);
        */

        // FIND_ID
        // String msg = JSONObject.toJSONString(new FindIdReq(user.getId(), "1"));

        // FIND_TIME
        // String msg = JSONObject.toJSONString(new FindTimeReq(user.getId(), "2", new Date()));

        // FIND_TIMES
        // String msg = JSON.toJSONString(new FindTimesReq(user.getId(), "1", new Date(2019-1900, Calendar.DECEMBER, 10), new Date()));

        // FIND_NODE_EVENT
        // String msg = JSON.toJSONString(new FindNodeEventReq(user.getId(), "1", "1"));

        // Update
        // String msg = JSONObject.toJSONString(new UpdateReq(user.getId(), true,"2", "male", "male"));

        // CREATE
        // HashMap<String, String> map = new HashMap<String, String>();
        // map.put("pos", "pos_a");
        // map.put("num", "2");
        // List<String> events = new ArrayList<String>();
        // events.add("1");
        // String msg = JSONObject.toJSONString(new CreateReq(user.getId(), true,"1", "resource_1", "灭火器", "1", events, map));

        // DELETE
        String msg = JSONObject.toJSONString(new DeleteReq(user.getId(), true, "1"));

        // SUB_TEMPLATE
        // List<String> events = new ArrayList<String>();
        // events.add("1");
        // String msg = JSONObject.toJSONString(new SubTemplateReq(user.getId(),"1", events));
        // Rabbit.sendObjRequest(msg);

        // SUB_OBJECT
        // String msg = JSONObject.toJSONString(new SubObjectReq(user.getId(), "1", true));

        // SUB_ATTR
        // List<String> attrs = new ArrayList<String>();
        // attrs.add("pos");
        // String msg = JSONObject.toJSONString(new SubAttributeReq(user.getId(), "1", attrs, true));

        Rabbit.sendObjRequest(msg);
        //Rabbit.sendSubRequest(msg);
        // String msg = "{\"xx\": \"123\" , \"id\": {}}";
        System.out.println(msg);
        // System.out.println(JSON.parseObject(msg).getJSONObject("id"));
        int k = 0;
        while (true) {
            // System.out.println(k);
            k += 1;
            Thread.sleep(1000);
            String res = Rabbit.getOneMsg(user.getName());
            if (res != null) {
                System.out.println(res);
                // System.out.println(parseRes.parse(res).toString());
            }
        }

        // Rabbit.close();

    }
}
