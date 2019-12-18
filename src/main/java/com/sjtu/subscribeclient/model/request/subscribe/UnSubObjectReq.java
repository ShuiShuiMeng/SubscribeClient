package com.sjtu.subscribeclient.model.request.subscribe;

import com.sjtu.subscribeclient.model.request.base.BaseReq;

public class UnSubObjectReq extends BaseReq {

    public UnSubObjectReq(String userId, String id) {
        this.op = "UNSUB_OBJECT";
        this.userId = userId;
        this.id = id;
    }
}
