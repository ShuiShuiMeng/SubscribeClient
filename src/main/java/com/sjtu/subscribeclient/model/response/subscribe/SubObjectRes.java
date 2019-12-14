package com.sjtu.subscribeclient.model.response.subscribe;

import com.sjtu.subscribeclient.model.object.ObjectRes;
import com.sjtu.subscribeclient.model.response.base.BaseRes;

public class SubObjectRes extends BaseRes {

    private String id;
    private ObjectRes object;

    public SubObjectRes(String status, String message, String id, ObjectRes object) {
        this.op = "SUB_OBJECT";
        this.status = status;
        this.message = message;
        this.id = id;
        this.object = object;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ObjectRes getObject() {
        return object;
    }

    public void setObject(ObjectRes object) {
        this.object = object;
    }
}
