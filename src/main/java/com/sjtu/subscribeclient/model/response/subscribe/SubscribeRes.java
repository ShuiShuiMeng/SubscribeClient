package com.sjtu.subscribeclient.model.response.subscribe;

import com.sjtu.subscribeclient.model.response.base.BaseRes;

public class SubscribeRes extends BaseRes {

    public SubscribeRes (String status) {
        this.op = "SUB";
        this.status = status;
    }
}
