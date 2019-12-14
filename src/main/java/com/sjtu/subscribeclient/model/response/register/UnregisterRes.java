package com.sjtu.subscribeclient.model.response.register;

import com.sjtu.subscribeclient.model.response.base.BaseRes;

public class UnregisterRes extends BaseRes {

    public UnregisterRes(String status) {
        this.op = "UNREGISTER";
        this.status = status;
    }
}
