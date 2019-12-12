package com.sjtu.subscribeclient.model.request.cud;

import com.sjtu.subscribeclient.model.request.base.BaseReq;

public class DeleteReq extends BaseReq {
    private boolean response;

    // response 默认打开
    public DeleteReq(String userId, String id) {
        new DeleteReq(userId, true, id);
    }

    public DeleteReq(String userId, boolean response, String id) {
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
