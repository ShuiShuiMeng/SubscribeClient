package com.sjtu.subscribeclient.model.request.object;

import com.sjtu.subscribeclient.model.request.base.BaseReq;

public class ObjDeleteReq extends BaseReq {
    private boolean response;

    public ObjDeleteReq(String userId, boolean response, String id) {
        this.op = "DELETE_OBJECT";
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
