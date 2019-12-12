package com.sjtu.subscribeclient.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sjtu.subscribeclient.model.object.AttributeRes;
import com.sjtu.subscribeclient.model.object.ObjectRes;
import com.sjtu.subscribeclient.model.response.cud.CreateRes;
import com.sjtu.subscribeclient.model.response.cud.DeleteRes;
import com.sjtu.subscribeclient.model.response.cud.UpdateRes;
import com.sjtu.subscribeclient.model.response.find.FindEventRes;
import com.sjtu.subscribeclient.model.response.find.FindIdRes;
import com.sjtu.subscribeclient.model.response.find.FindTimeRes;
import com.sjtu.subscribeclient.model.response.find.FindTimesRes;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Utils {
    public static CreateRes parseCreateRes(String msg) {
        JSONObject jsonObject = JSON.parseObject(msg);
        // res.status
        String status = jsonObject.getString("status");
        // res.message
        String message = jsonObject.getString("message");
        return new CreateRes(status, message);
    }

    public static DeleteRes parseDeleteRes(String msg) {
        JSONObject jsonObject = JSON.parseObject(msg);
        // res.status
        String status = jsonObject.getString("status");
        // res.message
        String message = jsonObject.getString("message");
        return new DeleteRes(status, message);
    }

    public static UpdateRes parseUpdateRes(String msg) {
        JSONObject jsonObject = JSON.parseObject(msg);
        // res.status
        String status = jsonObject.getString("status");
        // res.message
        String message = jsonObject.getString("message");
        return new UpdateRes(status, message);
    }

    public static FindIdRes parseFindIdRes(String msg) {
        JSONObject jsonObject = JSON.parseObject(msg);
        // res.status
        String status = jsonObject.getString("status");
        // res.object
        return new FindIdRes(status, parseToObject(jsonObject));
    }

    public static FindTimeRes parseFindTimeRes(String msg) {
        JSONObject jsonObject = JSON.parseObject(msg);
        // res.status
        String status = jsonObject.getString("status");
        // res.object
        return new FindTimeRes(status, parseToObject(jsonObject));
    }

    public static FindTimesRes parseFindTimesRes(String msg) {
        JSONObject jsonObject = JSON.parseObject(msg);
        // res.status
        String status = jsonObject.getString("status");
        // res.objects
        JSONArray objectsArray = jsonObject.getJSONArray("objects");
        List<ObjectRes> objects = new ArrayList<ObjectRes>();
        final int length = objectsArray.size();
        for (int i=0; i<length; ++i) {
            objects.add(parseToObject(objectsArray.getJSONObject(i)));
        }
        return new FindTimesRes(status, objects);
    }

    public static FindEventRes parseFindEventRes(String msg) {
        JSONObject jsonObject = JSON.parseObject(msg);
        // res.status
        String status = jsonObject.getString("status");
        // res.objects
        JSONArray objectsArray = jsonObject.getJSONArray("objects");
        List<ObjectRes> objects = new ArrayList<ObjectRes>();
        final int length = objectsArray.size();
        for (int i=0; i<length; ++i) {
            objects.add(parseToObject(objectsArray.getJSONObject(i)));
        }
        return new FindEventRes(status, objects);
    }

    private static ObjectRes parseToObject(JSONObject jsonObject) {
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

        return new ObjectRes(id, name, intro, type, template, eventsMap, attrsMap, createTime, updateTime);
    }
}
