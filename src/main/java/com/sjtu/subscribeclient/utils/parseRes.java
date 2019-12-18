package com.sjtu.subscribeclient.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sjtu.subscribeclient.model.object.AttributeRes;
import com.sjtu.subscribeclient.model.object.EventRes;
import com.sjtu.subscribeclient.model.object.ObjectRes;
import com.sjtu.subscribeclient.model.response.event.EventCreateRes;
import com.sjtu.subscribeclient.model.response.event.EventDeleteRes;
import com.sjtu.subscribeclient.model.response.event.EventFindIdRes;
import com.sjtu.subscribeclient.model.response.event.EventUpdateRes;
import com.sjtu.subscribeclient.model.response.object.ObjCreateRes;
import com.sjtu.subscribeclient.model.response.object.ObjDeleteRes;
import com.sjtu.subscribeclient.model.response.object.ObjUpdateRes;
import com.sjtu.subscribeclient.model.response.object.ObjFindNodeEventRes;
import com.sjtu.subscribeclient.model.response.object.ObjFindIdRes;
import com.sjtu.subscribeclient.model.response.object.ObjFindTimeRes;
import com.sjtu.subscribeclient.model.response.object.ObjFindTimesRes;
import com.sjtu.subscribeclient.model.response.subscribe.*;

import java.awt.*;
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
    public static ObjCreateRes parseObjCreateRes(String res) {
        JSONObject jsonObject = JSON.parseObject(res);
        // res.status
        String status = jsonObject.getString("status");
        // res.message
        String message = jsonObject.getString("message");
        // res.id
        String id = jsonObject.getString("id");
        return new ObjCreateRes(status, message, id);
    }

    /**
     * 删除对象返回信息解析
     * @param res JSON信息
     * @return 消息类
     */
    public static ObjDeleteRes parseObjDeleteRes(String res) {
        JSONObject jsonObject = JSON.parseObject(res);
        // res.status
        String status = jsonObject.getString("status");
        // res.message
        String message = jsonObject.getString("message");
        // res.id
        String id = jsonObject.getString("id");
        return new ObjDeleteRes(status, message, id);
    }

    /**
     * 更新对象返回信息解析
     * @param res JSON信息
     * @return 消息类
     */
    public static ObjUpdateRes parseObjUpdateRes(String res) {
        JSONObject jsonObject = JSON.parseObject(res);
        // res.status
        String status = jsonObject.getString("status");
        // res.message
        String message = jsonObject.getString("message");
        // res.id
        String id = jsonObject.getString("id");
        // res.name
        String name = jsonObject.getString("name");
        return new ObjUpdateRes(status, message, id, name);
    }

    /**
     * 查询对象返回信息解析
     * 查询条件：id
     * @param res JSON信息
     * @return 消息类
     */
    public static ObjFindIdRes parseObjFindIdRes(String res) {
        JSONObject jsonObject = JSON.parseObject(res);
        // res.status
        String status = jsonObject.getString("status");
        // res.message
        String message = jsonObject.getString("message");
        // res.id
        String id = jsonObject.getString("id");
        // res.object
        JSONObject object = jsonObject.getJSONObject("object");
        return new ObjFindIdRes(status, message, id, parseToObject(object));
    }

    /**
     * 查询对象返回信息解析
     * 查询条件：id, date
     * @param res JSON信息
     * @return 消息类
     */
    public static ObjFindTimeRes parseObjFindTimeRes(String res) {
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
        return new ObjFindTimeRes(status, message, id, date, parseToObject(object));
    }

    /**
     * 查询对象返回信息解析
     * 查询条件：id, start, end
     * @param res JSON信息
     * @return 消息类
     */
    public static ObjFindTimesRes parseObjFindTimesRes(String res) {
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
        return new ObjFindTimesRes(status, message, id, start, end, objects);
    }

    /**
     * 查询对象返回信息解析
     * 查询条件：nodeId, eventId
     * @param res JSON信息
     * @return 消息类
     */
    public static ObjFindNodeEventRes parseObjFindNodeEventRes(String res) {
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
        return new ObjFindNodeEventRes(status, message, nodeId, eventId, objects);
    }

    /**
     * 创建事件返回信息解析
     * @param res 响应JSON
     * @return 消息类
     */
    public static EventCreateRes parseEventCreateRes(String res) {
        JSONObject jsonObject = JSON.parseObject(res);
        // res.status
        String status = jsonObject.getString("status");
        // res.message
        String message = jsonObject.getString("message");
        // res.id
        String id = jsonObject.getString("id");
        return new EventCreateRes(status, message, id);
    }

    /**
     * 删除事件返回信息解析
     * @param res JSON信息
     * @return 消息类
     */
    public static EventDeleteRes parseEventDeleteRes(String res) {
        JSONObject jsonObject = JSON.parseObject(res);
        // res.status
        String status = jsonObject.getString("status");
        // res.message
        String message = jsonObject.getString("message");
        // res.id
        String id = jsonObject.getString("id");
        return new EventDeleteRes(status, message, id);
    }

    /**
     * 更新事件返回信息解析
     * @param res JSON信息
     * @return 消息类
     */
    public static EventUpdateRes parseEventUpdateRes(String res) {
        JSONObject jsonObject = JSON.parseObject(res);
        // res.status
        String status = jsonObject.getString("status");
        // res.message
        String message = jsonObject.getString("message");
        // res.id
        String id = jsonObject.getString("id");
        // res.name
        String name = jsonObject.getString("name");
        return new EventUpdateRes(status, message, id, name);
    }
    /**
     * 查询事件返回信息解析
     * 查询条件：id
     * @param res JSON信息
     * @return 消息类
     */
    public static EventFindIdRes parseEventFindIdRes(String res) {
        JSONObject jsonObject = JSON.parseObject(res);
        // res.status
        String status = jsonObject.getString("status");
        // res.message
        String message = jsonObject.getString("message");
        // res.id
        String id = jsonObject.getString("id");
        // res.object
        JSONObject event = jsonObject.getJSONObject("event");
        return new EventFindIdRes(status, message, id, parseToEvent(event));
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
     * 取消订阅对象
     * @param res JSON信息
     * @return 消息类
     */
    public static UnSubObjectRes parseUnSubObjectRes(String res) {
        final JSONObject jsonObject = JSON.parseObject(res);
        // res.status
        String status = jsonObject.getString("status");
        // res.message
        String message = jsonObject.getString("message");
        // res.id
        String id = jsonObject.getString("id");
        return new UnSubObjectRes(status, message, id);
    }


    /**
     *
     */
    public static UnSubAttributeRes parseUnSubAttributeRes(String res) {
        final JSONObject jsonObject = JSON.parseObject(res);
        // res.status
        String status = jsonObject.getString("status");
        // res.message
        String message = jsonObject.getString("message");
        // res.id
        String id = jsonObject.getString("id");
        // res.names
        JSONArray namesArray = jsonObject.getJSONArray("names");
        List<String> names = JSONObject.parseArray(namesArray.toJSONString(), String.class);
        return new UnSubAttributeRes(status, message, id, names);
    }

    /**
     * 取消订阅模板
     * @param res JSON信息
     * @return 消息类
     */
    public static UnSubTemplateRes parseUnSubTemplateRes(String res) {
        final JSONObject jsonObject = JSON.parseObject(res);
        // res.status
        String status = jsonObject.getString("status");
        // res.message
        String message = jsonObject.getString("message");
        // res.template
        String template = jsonObject.getString("template");
        return new UnSubTemplateRes(status, message, template);
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

        return new ObjectRes(id, name, intro, template, eventsMap, attrsMap, createTime, updateTime);
    }

    /**
     * 将JSON中的事件提取出来
     * @param event json对象
     * @return 事件
     */
    static EventRes parseToEvent(JSONObject event) {
        // 有效性检测
        if (event == null) return null;
        String id = event.getString("id");
        String name = event.getString("name");
        String intro = event.getString("intro");
        String template = event.getString("template");
        String stage = event.getString("stage");
        boolean status = event.getBoolean("status");

        // res.event.objects
        JSONArray objectsArray = event.getJSONArray("objects");
        List<String> objects = JSONObject.parseArray(objectsArray.toJSONString(), String.class);

        // res.event.attrs
        HashMap<String, AttributeRes> attrsMap = new HashMap<String, AttributeRes>();
        JSONObject attrs = event.getJSONObject("attrs");
        for (String attr : attrs.keySet()) {
            // res.object.attrs.xxx
            JSONObject attrObject = attrs.getJSONObject(attr);
            AttributeRes attributeRes = new AttributeRes(attrObject.getString("value"), attrObject.getDate("updateTime"));
            attrsMap.put(attr, attributeRes);
        }
        // res.startTime & res.endTime
        Date startTime = event.getDate("startTime");
        Date endTime = event.getDate("endTime");

        // res.createTime & res.updateTime
        Date createTime = event.getDate("createTime");
        Date updateTime = event.getDate("updateTime");

        return new EventRes(id, name, intro, template, objects, attrsMap, startTime, endTime, status, stage, createTime, updateTime);
    }
}
