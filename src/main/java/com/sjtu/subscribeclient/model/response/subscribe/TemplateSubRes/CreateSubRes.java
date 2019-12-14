package com.sjtu.subscribeclient.model.response.subscribe.TemplateSubRes;

import com.sjtu.subscribeclient.model.object.ObjectRes;
import com.sjtu.subscribeclient.model.response.subscribe.BaseSubRes;

public class CreateSubRes extends BaseSubRes {
    private String id;
    private ObjectRes object;

    public CreateSubRes(String message, String id, ObjectRes object) {
        this.op = "SUB_RES_OBJ_CREATE";
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
