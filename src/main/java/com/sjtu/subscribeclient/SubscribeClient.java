package com.sjtu.subscribeclient;

import com.alibaba.fastjson.JSONObject;
import com.sjtu.subscribeclient.model.request.event.EventCreateReq;
import com.sjtu.subscribeclient.model.request.event.EventDeleteReq;
import com.sjtu.subscribeclient.model.request.event.EventFindIdReq;
import com.sjtu.subscribeclient.model.request.event.EventUpdateReq;
import com.sjtu.subscribeclient.model.request.subscribe.*;
import com.sjtu.subscribeclient.model.response.subscribe.UnSubObjectRes;
import com.sjtu.subscribeclient.model.user.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        // String msg = JSONObject.toJSONString(new ObjFindIdReq(user.getId(), "1"));

        // FIND_TIME
        // String msg = JSONObject.toJSONString(new ObjFindTimeReq(user.getId(), "2", new Date()));

        // FIND_TIMES
        // String msg = JSON.toJSONString(new ObjFindTimesReq(user.getId(), "1", new Date(2019-1900, Calendar.DECEMBER, 10), new Date()));

        // FIND_NODE_EVENT
        // String msg = JSON.toJSONString(new ObjFindNodeEventReq(user.getId(), "1", "1"));

        // Update
        // String msg = JSONObject.toJSONString(new ObjUpdateReq(user.getId(), true,"2", "male", "male"));

        // CREATE
        // HashMap<String, String> map = new HashMap<String, String>();
        // map.put("pos", "pos_a");
        // map.put("num", "2");
        // List<String> events = new ArrayList<String>();
        // events.add("1");
        // String msg = JSONObject.toJSONString(new ObjCreateReq(user.getId(), true,"1", "resource_1", "灭火器", "1", events, map));

        // DELETE
        // String msg = JSONObject.toJSONString(new ObjDeleteReq(user.getId(), true, "1"));

        // SUB_TEMPLATE
        List<String> events = new ArrayList<String>();
        events.add("1");
        String msg = JSONObject.toJSONString(new SubTemplateReq(user.getId(),"1", null));
        Rabbit.sendObjRequest(msg);

        // SUB_OBJECT
        // String msg = JSONObject.toJSONString(new SubObjectReq(user.getId(), "2", true));
        // Rabbit.sendSubRequest(msg);

        // SUB_ATTR
        // List<String> attrs = new ArrayList<String>();
        // attrs.add("pos");
        // String msg = JSONObject.toJSONString(new SubAttributeReq(user.getId(), "2", attrs, true));

        // UNSUB_ATTR
        // List<String> attrs = new ArrayList<String>();
        // attrs.add("pos");
        // String msg = JSONObject.toJSONString(new UnSubAttributeReq(user.getId(), "2", attrs));

        // UNSUB_TEMPLATE
        // String msg = JSONObject.toJSONString(new UnSubTemplateReq(user.getId(), "3"));

        // UNSUB_OBJECT
        // String msg = JSONObject.toJSONString(new UnSubObjectReq(user.getId(), "2"));
        // CREATE_EVENT
        // HashMap<String, String> map = new HashMap<String, String>();
        // map.put("pos", "111");
        // map.put("time", "222");
        // String msg = JSONObject.toJSONString(new EventCreateReq(user.getId(), true, "10", "123", "intro", "3", map));

        // UPDATE_EVENT
        // String msg = JSONObject.toJSONString(new EventUpdateReq(user.getId(), true,"10", "pos", "000"));

        // EVENT_FIND_ID
        // String msg = JSONObject.toJSONString(new EventFindIdReq(user.getId(),"10"));

        // EVENT_DELETE
        // String msg = JSONObject.toJSONString(new EventDeleteReq(user.getId(), true, "10"));
        // Rabbit.sendObjRequest(msg);

        Rabbit.sendSubRequest(msg);
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
