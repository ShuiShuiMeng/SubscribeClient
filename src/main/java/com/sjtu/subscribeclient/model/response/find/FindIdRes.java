package com.sjtu.subscribeclient.model.response.find;

import com.sjtu.subscribeclient.model.object.ObjectRes;
import com.sjtu.subscribeclient.model.response.base.BaseRes;

public class FindIdRes extends BaseRes {

    private ObjectRes object;
    private String id;

    public FindIdRes(String status, String message, String id, ObjectRes object) {
        this.op = "FIND_ID";
        this.status = status;
        this.message = message;
        this.id = id;
        this.object = object;
    }

    public ObjectRes getObject() {
        return object;
    }

    public void setObject(ObjectRes object) {
        this.object = object;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{\"op\":" + op + ",\"status\":" + status + ",\"object\":" + object.toString() + "}";
    }
}
