package com.sjtu.subscribeclient.model.notice;

import com.sjtu.subscribeclient.model.object.ObjectRes;

public class TemplateCreateNotice extends BaseNoticeRes {

    private String type;
    private ObjectRes object;

    public TemplateCreateNotice(String message, String type, ObjectRes object) {
        this.op = "SUB_RES_OBJ_CREATE";
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
