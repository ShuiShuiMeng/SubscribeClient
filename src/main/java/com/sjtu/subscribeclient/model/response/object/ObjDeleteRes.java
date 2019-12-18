package com.sjtu.subscribeclient.model.response.object;

import com.sjtu.subscribeclient.model.response.base.BaseRes;

public class ObjDeleteRes extends BaseRes {

    private String id;

    public ObjDeleteRes(String status, String message, String id) {
        this.op = "DELETE_OBJECT";
        this.status = status;
        this.message = message;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{\"op\":" + op + ",\"status\":" + status + ",\"message\":" + message + "}";
    }
}
