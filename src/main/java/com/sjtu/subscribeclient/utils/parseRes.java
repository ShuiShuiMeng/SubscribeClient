package com.sjtu.subscribeclient.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sjtu.subscribeclient.model.object.AttributeRes;
import com.sjtu.subscribeclient.model.object.ObjectRes;
import com.sjtu.subscribeclient.model.response.cud.CreateRes;
import com.sjtu.subscribeclient.model.response.cud.DeleteRes;
import com.sjtu.subscribeclient.model.response.cud.UpdateRes;
import com.sjtu.subscribeclient.model.response.find.FindNodeEventRes;
import com.sjtu.subscribeclient.model.response.find.FindIdRes;
import com.sjtu.subscribeclient.model.response.find.FindTimeRes;
import com.sjtu.subscribeclient.model.response.find.FindTimesRes;
import com.sjtu.subscribeclient.model.response.subscribe.SubAttributeRes;
import com.sjtu.subscribeclient.model.response.subscribe.SubObjectRes;
import com.sjtu.subscribeclient.model.response.subscribe.SubTemplateRes;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class parseRes {
    /**
     * 创建对象返回信息解析
     * @param res JSON信息
     * @return 消息类
     */
    public static CreateRes parseCreateRes(String res) {
        JSONObject jsonObject = JSON.parseObject(res);
        // res.status
        String status = jsonObject.getString("status");
        // res.message
        String message = jsonObject.getString("message");
        // res.id
        String id = jsonObject.getString("id");
        return new CreateRes(status, message, id);
    }

    /**
     * 删除对象返回信息解析
     * @param res JSON信息
     * @return 消息类
     */
    public static DeleteRes parseDeleteRes(String res) {
        JSONObject jsonObject = JSON.parseObject(res);
        // res.status
        String status = jsonObject.getString("status");
        // res.message
        String message = jsonObject.getString("message");
        // res.id
        String id = jsonObject.getString("id");
        return new DeleteRes(status, message, id);
    }

    /**
     * 更新对象返回信息解析
     * @param res JSON信息
     * @return 消息类
     */
    public static UpdateRes parseUpdateRes(String res) {
        JSONObject jsonObject = JSON.parseObject(res);
        // res.status
        String status = jsonObject.getString("status");
        // res.message
        String message = jsonObject.getString("message");
        // res.id
        String id = jsonObject.getString("id");
        // res.name
        String name = jsonObject.getString("name");
        return new UpdateRes(status, message, id, name);
    }

    /**
     * 查询对象返回信息解析
     * 查询条件：id
     * @param res JSON信息
     * @return 消息类
     */
    public static FindIdRes parseFindIdRes(String res) {
        JSONObject jsonObject = JSON.parseObject(res);
        // res.status
        String status = jsonObject.getString("status");
        // res.message
        String message = jsonObject.getString("message");
        // res.id
        String id = jsonObject.getString("id");
        // res.object
        JSONObject object = jsonObject.getJSONObject("object");
        return new FindIdRes(status, message, id, parseToObject(object));
    }

    /**
     * 查询对象返回信息解析
     * 查询条件：id, date
     * @param res JSON信息
     * @return 消息类
     */
    public static FindTimeRes parseFindTimeRes(String res) {
        JSONObject jsonObject = JSON.parseObject(res);
        // res.status
        String status = jsonObject.getString("status");
        // res.message
        String message = jsonObject.getString("message");
        // res.id
        String id = jsonObject.getString("id");
        // res.date
        Date date = jsonObject.getDate("date");
        // res.object
        JSONObject object = jsonObject.getJSONObject("object");
        return new FindTimeRes(status, message, id, date, parseToObject(object));
    }

    /**
     * 查询对象返回信息解析
     * 查询条件：id, start, end
     * @param res JSON信息
     * @return 消息类
     */
    public static FindTimesRes parseFindTimesRes(String res) {
        JSONObject jsonObject = JSON.parseObject(res);
        // res.status
        String status = jsonObject.getString("status");
        // res.message
        String message = jsonObject.getString("message");
        // res.id
        String id = jsonObject.getString("id");
        // res.start
        Date start = jsonObject.getDate("start");
        // res.end
        Date end = jsonObject.getDate("end");
        // res.objects
        JSONArray objectsArray = jsonObject.getJSONArray("objects");
        List<ObjectRes> objects = new ArrayList<ObjectRes>();
        final int length = objectsArray.size();
        // System.out.println(objectsArray);
        for (int i=0; i<length; ++i) {
            // System.out.println(objectsArray.getJSONObject(i));
            objects.add(parseToObject(objectsArray.getJSONObject(i)));
        }
        return new FindTimesRes(status, message, id, start, end, objects);
    }

    /**
     * 查询对象返回信息解析
     * 查询条件：nodeId, eventId
     * @param res JSON信息
     * @return 消息类
     */
    public static FindNodeEventRes parseFindNodeEventRes(String res) {
        JSONObject jsonObject = JSON.parseObject(res);
        // res.status
        String status = jsonObject.getString("status");
        // res.message
        String message = jsonObject.getString("message");
        // res.nodeId
        String nodeId = jsonObject.getString("nodeId");
        // res.eventId
        String eventId = jsonObject.getString("eventId");
        // res.objects
        JSONArray objectsArray = jsonObject.getJSONArray("objects");
        List<ObjectRes> objects = new ArrayList<ObjectRes>();
        final int length = objectsArray.size();
        for (int i=0; i<length; ++i) {
            objects.add(parseToObject(objectsArray.getJSONObject(i)));
        }
        return new FindNodeEventRes(status, message, nodeId, eventId, objects);
    }

    /**
     * 订阅对象返回信息解析
     * @param res JSON信息
     * @return 消息类
     */
    public static SubObjectRes parseSubObjectRes(String res) {
        JSONObject jsonObject = JSON.parseObject(res);
        // res.status
        String status = jsonObject.getString("status");
        // res.message
        String message = jsonObject.getString("message");
        // res.id
        String id = jsonObject.getString("id");
        // res.object
        return new SubObjectRes(status, message, id, parseToObject(jsonObject));
    }

    /**
     * 订阅对象部分属性返回信息解析
     * @param res JSON信息
     * @return 消息类
     */
    public static SubAttributeRes parseSubAttributeRes(String res) {
        JSONObject jsonObject = JSON.parseObject(res);
        // res.status
        String status = jsonObject.getString("status");
        // res.message
        String message = jsonObject.getString("message");
        // res.id
        String id = jsonObject.getString("id");
        // res.names
        JSONArray namesArray = jsonObject.getJSONArray("names");
        List<String> names = JSONObject.parseArray(namesArray.toJSONString(), String.class);
        // res.attrs
        JSONObject attrsObject = jsonObject.getJSONObject("attrs");
        HashMap<String, AttributeRes> attrs = new HashMap<String, AttributeRes>();
        for (String attr : attrsObject.keySet()) {
            JSONObject attrObject = attrsObject.getJSONObject(attr);
            AttributeRes attributeRes = new AttributeRes(attrObject.getString("value"), attrObject.getDate("updateTime"));
            attrs.put(attr, attributeRes);
        }
        return new SubAttributeRes(status, message, id, names, attrs);
    }

    /**
     * 订阅模板返回信息解析
     * @param res JSON信息
     * @return 消息类
     */
    public static SubTemplateRes parseSubTemplateRes(String res) {
        final JSONObject jsonObject = JSON.parseObject(res);
        // res.status
        String status = jsonObject.getString("status");
        // res.message
        String message = jsonObject.getString("message");
        // res.template
        String template = jsonObject.getString("template");
        // res.events
        JSONArray eventsArray = jsonObject.getJSONArray("events");
        List<String> events = JSONObject.parseArray(eventsArray.toJSONString(), String.class);
        return new SubTemplateRes(status, message, template, events);
    }

    /**
     * 将JSON中的对象提取出来
     * @param object json对象
     * @return 对象
     */
    static ObjectRes parseToObject(JSONObject object) {
        // 有效性检测
        if (object == null) return null;
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
