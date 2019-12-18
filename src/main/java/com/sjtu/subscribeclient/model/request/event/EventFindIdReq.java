package com.sjtu.subscribeclient.model.request.event;

import com.sjtu.subscribeclient.model.request.base.BaseReq;

public class EventFindIdReq extends BaseReq {

    public EventFindIdReq(String userId, String id) {
        this.op = "EVENT_FIND_ID";
        this.userId = userId;
        this.id = id;
    }
}
