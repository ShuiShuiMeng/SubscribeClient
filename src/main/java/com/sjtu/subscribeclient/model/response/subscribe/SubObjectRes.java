package com.sjtu.subscribeclient.model.response.subscribe;

import com.sjtu.subscribeclient.model.response.base.BaseRes;

public class SubObjectRes extends BaseRes {

    public SubObjectRes(String status, String message) {
        this.op = "SUB_OBJECT";
        this.status = status;
        this.message = message;
    }
}
