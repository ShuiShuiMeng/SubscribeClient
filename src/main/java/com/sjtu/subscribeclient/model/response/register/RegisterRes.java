package com.sjtu.subscribeclient.model.response.register;

import com.sjtu.subscribeclient.model.response.base.BaseRes;

public class RegisterRes extends BaseRes {

    private String userId;
    private String name;
    private String intro;

    public RegisterRes(String status, String message, String userId, String name, String intro) {
        this.op = "REGISTER";
        this.status = status;
        this.message = message;
        this.userId = userId;
        this.name = name;
        this.intro = intro;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}
