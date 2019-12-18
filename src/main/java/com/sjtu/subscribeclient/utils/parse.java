package com.sjtu.subscribeclient.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class parse {
    public static String getOp(String msg) {
        JSONObject jsonObject = JSON.parseObject(msg);
        return jsonObject.getString("op");
    }
}
