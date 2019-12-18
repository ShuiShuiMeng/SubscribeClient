package com.sjtu.subscribeclient.model.request.event;

import com.sjtu.subscribeclient.model.request.base.BaseReq;

public class EventDeleteReq extends BaseReq {
    private boolean response;

    public EventDeleteReq(String userId, boolean response, String id) {
        this.op = "DELETE_EVENT";
        this.userId = userId;
        this.id = id;
        this.response = response;
    }

    public boolean getResponse() {
        return response;
    }

    public void setResponse(boolean response) {
        this.response = response;
    }
}
