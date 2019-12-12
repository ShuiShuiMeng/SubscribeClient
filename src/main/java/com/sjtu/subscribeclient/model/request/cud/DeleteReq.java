package com.sjtu.subscribeclient.model.request.cud;

import com.sjtu.subscribeclient.model.request.base.BaseReq;

public class DeleteReq extends BaseReq {
    private boolean response;

    public DeleteReq(String userId, String id) {
        new DeleteReq(userId, id, true);
    }

    public DeleteReq(String userId, String id, boolean response) {
        this.op = "DELETE";
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
