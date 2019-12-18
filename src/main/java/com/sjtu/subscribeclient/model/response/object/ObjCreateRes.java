package com.sjtu.subscribeclient.model.response.object;

import com.sjtu.subscribeclient.model.response.base.BaseRes;

public class ObjCreateRes extends BaseRes {

    private String id;

    public ObjCreateRes(String status, String message, String id) {
        this.op = "CREATE_OBJECT";
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
