package com.sjtu.subscribeclient.model.notice;

import com.sjtu.subscribeclient.model.object.ObjectRes;

public class ObjectCreateNotice extends BaseNotice {

    private String type;
    private ObjectRes object;

    public ObjectCreateNotice(String message, String type, ObjectRes object) {
        this.op = "OBJECT_CREATE_NOTICE";
        this.type = type;
        this.message = message;
        this.object = object;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ObjectRes getObject() {
        return object;
    }

    public void setObject(ObjectRes object) {
        this.object = object;
    }
}
