package com.sjtu.subscribeclient.model.request.object;

import com.sjtu.subscribeclient.model.request.base.BaseReq;

public class ObjFindIdReq extends BaseReq {

    public ObjFindIdReq(String userId, String id) {
        this.op = "EVENT_FIND_ID";
        this.userId = userId;
        this.id = id;
    }
}
