package com.sjtu.subscribeclient.model.response.register;

import com.sjtu.subscribeclient.model.response.base.BaseRes;

public class RegisterRes extends BaseRes {

    private String userId;

    public RegisterRes(String status, String message, String userId) {
        this.op = "REGISTER";
        this.status = status;
        this.message = message;
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
