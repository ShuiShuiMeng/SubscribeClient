package com.sjtu.subscribeclient.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sjtu.subscribeclient.model.notice.ObjectCreateNotice;
import com.sjtu.subscribeclient.model.notice.ObjectDeleteNotice;
import com.sjtu.subscribeclient.model.notice.ObjectUpdateNotice;

import java.util.Date;

public class parseNotice {

    public static ObjectCreateNotice parseCreateNotice(String notice) {
        JSONObject jsonObject = JSON.parseObject(notice);
        // notice.message
        String message = jsonObject.getString("message");
        // notice.type
        String type = jsonObject.getString("type");
        return new ObjectCreateNotice(message, type, parseRes.parseToObject(jsonObject));
    }

    public static ObjectDeleteNotice parseDeleteNotice(String notice) {
        JSONObject jsonObject = JSON.parseObject(notice);
        // notice.message
        String message = jsonObject.getString("message");
        // notice.id
        String id = jsonObject.getString("id");
        return new ObjectDeleteNotice(message, id);
    }

    public static ObjectUpdateNotice parseUpdateNotice(String notice) {
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
        return new ObjectUpdateNotice(message, id, name, value, updateTime);
    }
}
