package com.sjtu.subscribeclient.model.response.object;

import com.sjtu.subscribeclient.model.object.ObjectRes;
import com.sjtu.subscribeclient.model.response.base.BaseRes;

import java.util.Date;

public class ObjFindTimeRes extends BaseRes {

    private ObjectRes object;
    private String id;
    private Date date;

    public ObjFindTimeRes(String status, String message, String id, Date date, ObjectRes object) {
        this.op = "OBJECT_FIND_TIME";
        this.status = status;
        this.message = message;
        this.id = id;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "{\"op\":" + op + ",\"status\":" + status + ",\"object\":" + object.toString() + "}";
    }
}
