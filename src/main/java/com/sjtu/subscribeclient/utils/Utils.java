package com.sjtu.subscribeclient.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sjtu.subscribeclient.model.object.AttributeRes;
import com.sjtu.subscribeclient.model.object.ObjectRes;
import com.sjtu.subscribeclient.model.response.find.FindEventRes;
import com.sjtu.subscribeclient.model.response.find.FindIdRes;
import com.sjtu.subscribeclient.model.response.find.FindTimeRes;
import com.sjtu.subscribeclient.model.response.find.FindTimesRes;

import java.util.Date;
import java.util.HashMap;

public class Utils {
    public static FindIdRes parseFindIdRes(String msg) {
        JSONObject jsonObject = JSON.parseObject(msg);
        // res.status
        String status = jsonObject.getString("status");

        // res.object
        JSONObject object = jsonObject.getJSONObject("object");
        String id = object.getString("id");
        String name = object.getString("name");
        String intro = object.getString("intro");
        String type = object.getString("type");
        String template = object.getString("template");

        // res.object.events
        HashMap<String, Date> eventsMap = new HashMap<String, Date>();
        JSONObject events = object.getJSONObject("events");
        for (String event : events.keySet()) {
            eventsMap.put(event, events.getDate(event));
        }

        // res.object.attrs
        HashMap<String, AttributeRes> attrsMap = new HashMap<String, AttributeRes>();
        JSONObject attrs = object.getJSONObject("attrs");
        for (String attr : attrs.keySet()) {
            // res.object.attrs.xxx
            JSONObject attrObject = attrs.getJSONObject(attr);
            AttributeRes attributeRes = new AttributeRes(attrObject.getString("value"), attrObject.getDate("updateTime"));
            attrsMap.put(attr, attributeRes);
        }

        // res.createTime & res.updateTime
        Date createTime = object.getDate("createTime");
        Date updateTime = object.getDate("updateTime");

        ObjectRes objectRes = new ObjectRes(id, name, intro, type, template, eventsMap, attrsMap, createTime, updateTime);
        return new FindIdRes(status, objectRes);
    }

    public static FindTimeRes parseFindTimeRes(String msg) {
        FindIdRes findIdRes = parseFindIdRes(msg);
        return new FindTimeRes(findIdRes.getStatus(), findIdRes.getObject());
    }

    public static FindTimesRes parseFindTimesRes(String msg) {
        return null;
    }

    public static FindEventRes parseFindEventRes(String msg) {
        return null;
    }
}
