package com.sjtu.subscribeclient.model.response.find;

import com.sjtu.subscribeclient.model.object.ObjectRes;
import com.sjtu.subscribeclient.model.response.base.BaseRes;

public class FindIdRes extends BaseRes {
    private ObjectRes object;

    public FindIdRes(String status, ObjectRes object) {
        this.op = "FIND_ID";
        this.status = status;
        this.object = object;
    }

    public ObjectRes getObject() {
        return object;
    }

    public void setObject(ObjectRes object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "{\"op\":" + op + ",\"status\":" + status + ",\"object\":" + object.toString() + "}";
    }
}
