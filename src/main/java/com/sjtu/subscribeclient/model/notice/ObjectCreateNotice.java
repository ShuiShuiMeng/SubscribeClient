package com.sjtu.subscribeclient.model.notice;

import com.sjtu.subscribeclient.model.object.ObjectRes;

public class ObjectCreateNotice extends BaseNotice {

    private ObjectRes object;

    public ObjectCreateNotice(String message, ObjectRes object, String subType) {
        this.op = "OBJECT_CREATE_NOTICE";
        this.message = message;
        this.object = object;
        this.subType = subType;
    }

    public ObjectRes getObject() {
        return object;
    }

    public void setObject(ObjectRes object) {
        this.object = object;
    }
}
