package com.sjtu.subscribeclient.model.response.find;

import com.sjtu.subscribeclient.model.object.ObjectRes;
import com.sjtu.subscribeclient.model.response.base.BaseRes;

public class FindTimeRes extends BaseRes {
    private ObjectRes object;

    public FindTimeRes(String status, ObjectRes object) {
        this.op = "FIND_TIME";
        this.status = status;
        this.object = object;
    }

    public ObjectRes getObject() {
        return object;
    }

    public void setObject(ObjectRes object) {
        this.object = object;
    }
}
