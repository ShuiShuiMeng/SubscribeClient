package com.sjtu.subscribeclient.model.response.register;

import com.sjtu.subscribeclient.model.response.base.BaseRes;

public class UnregisterRes extends BaseRes {

    public UnregisterRes(String status, String message) {
        this.op = "UNREGISTER";
        this.message = message;
        this.status = status;
    }
}
