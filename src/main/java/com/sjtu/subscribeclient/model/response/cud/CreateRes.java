package com.sjtu.subscribeclient.model.response.cud;

import com.sjtu.subscribeclient.model.response.base.BaseRes;

public class CreateRes extends BaseRes {

    private String message;

    public CreateRes(String status, String message) {
        this.op = "CREATE";
        this.status = status;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "{\"op\":" + op + ",\"status\":" + status + ",\"message\":" + message + "}";
    }
}
