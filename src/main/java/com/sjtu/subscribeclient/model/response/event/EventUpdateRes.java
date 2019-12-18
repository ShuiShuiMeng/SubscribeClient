package com.sjtu.subscribeclient.model.response.event;

import com.sjtu.subscribeclient.model.response.base.BaseRes;

public class EventUpdateRes extends BaseRes {
    private String id;
    private String name;

    public EventUpdateRes(String status, String message, String id, String name) {
        this.op = "UPDATE_EVENT";
        this.status = status;
        this.message = message;
        this.id = id;
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{\"op\":" + op + ",\"status\":" + status + ",\"message\":" + message + "}";
    }
}
