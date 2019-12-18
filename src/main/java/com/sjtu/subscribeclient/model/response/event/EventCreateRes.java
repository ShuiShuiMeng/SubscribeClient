package com.sjtu.subscribeclient.model.response.event;

import com.sjtu.subscribeclient.model.response.base.BaseRes;

public class EventCreateRes extends BaseRes {
    private String id;

    public EventCreateRes(String status, String message, String id) {
        this.op = "CREATE_EVENT";
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
