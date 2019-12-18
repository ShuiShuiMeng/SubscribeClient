package com.sjtu.subscribeclient.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sjtu.subscribeclient.model.notice.*;

import java.util.Date;

public class parseNotice {

    /**
     * 对象创建通知解析
     * @param notice 通知
     * @return 消息类
     */
    public static ObjectCreateNotice parseObjectCreateNotice(String notice) {
        JSONObject jsonObject = JSON.parseObject(notice);
        // notice.message
        String message = jsonObject.getString("message");
        // notice.subType
        String subType = jsonObject.getString("subType");
        return new ObjectCreateNotice(message, parseRes.parseToObject(jsonObject), subType);
    }
    /**
     * 对象删除通知解析
     * @param notice 通知
     * @return 消息类
     */
    public static ObjectDeleteNotice parseObjectDeleteNotice(String notice) {
        JSONObject jsonObject = JSON.parseObject(notice);
        // notice.message
        String message = jsonObject.getString("message");
        // notice.id
        String id = jsonObject.getString("id");
        // notice.subType
        String subType = jsonObject.getString("subType");
        return new ObjectDeleteNotice(message, id, subType);
    }
    /**
     * 对象更新通知解析
     * @param notice 通知
     * @return 消息类
     */
    public static ObjectUpdateNotice parseObjectUpdateNotice(String notice) {
        JSONObject jsonObject = JSON.parseObject(notice);
        // notice.message
        String message = jsonObject.getString("message");
        // notice.id
        String id = jsonObject.getString("id");
        // notice.name
        String name = jsonObject.getString("name");
        // notice.value
        String value = jsonObject.getString("value");
        // notice.updateTime
        Date updateTime = jsonObject.getDate("updateTime");
        // notice.subType
        String subType = jsonObject.getString("subType");
        return new ObjectUpdateNotice(message, id, name, value, updateTime, subType);
    }
    /**
     * 事件创建通知解析
     * @param notice 通知
     * @return 消息类
     */
    public static EventCreateNotice parseEventCreateNotice(String notice) {
        JSONObject jsonObject = JSON.parseObject(notice);
        // notice.message
        String message = jsonObject.getString("message");
        // notice.subType
        String subType = jsonObject.getString("subType");
        return new EventCreateNotice(message, parseRes.parseToEvent(jsonObject), subType);
    }
    /**
     * 事件删除通知解析
     * @param notice 通知
     * @return 消息类
     */
    public static EventDeleteNotice parseEventDeleteNotice(String notice) {
        JSONObject jsonObject = JSON.parseObject(notice);
        // notice.message
        String message = jsonObject.getString("message");
        // notice.id
        String id = jsonObject.getString("id");
        // notice.subType
        String subType = jsonObject.getString("subType");
        return new EventDeleteNotice(message, id, subType);
    }
    /**
     * 事件更新通知解析
     * @param notice 通知
     * @return 消息类
     */
    public static EventUpdateNotice parseEventUpdateNotice(String notice) {
        JSONObject jsonObject = JSON.parseObject(notice);
        // notice.message
        String message = jsonObject.getString("message");
        // notice.id
        String id = jsonObject.getString("id");
        // notice.name
        String name = jsonObject.getString("name");
        // notice.value
        String value = jsonObject.getString("value");
        // notice.updateTime
        Date updateTime = jsonObject.getDate("updateTime");
        // notice.subType
        String subType = jsonObject.getString("subType");
        return new EventUpdateNotice(message, id, name, value, updateTime, subType);
    }
}
