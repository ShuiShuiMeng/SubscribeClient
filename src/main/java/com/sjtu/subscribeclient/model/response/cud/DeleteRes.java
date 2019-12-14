package com.sjtu.subscribeclient.model.response.cud;

import com.sjtu.subscribeclient.model.response.base.BaseRes;

public class DeleteRes extends BaseRes {

    private String id;

    public DeleteRes(String status, String message, String id) {
        this.op = "DELETE";
        this.status = status;
        this.message = message;
        this.id = id;
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

    @Override
    public String toString() {
        return "{\"op\":" + op + ",\"status\":" + status + ",\"message\":" + message + "}";
    }
}
