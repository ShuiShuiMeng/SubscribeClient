package com.sjtu.subscribeclient.model.response.register;

import com.sjtu.subscribeclient.model.response.base.BaseRes;

public class UnregisterRes extends BaseRes {

    private String userId;

    public UnregisterRes(String status, String message, String userId) {
        this.op = "UNREGISTER";
        this.message = message;
        this.status = status;
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
