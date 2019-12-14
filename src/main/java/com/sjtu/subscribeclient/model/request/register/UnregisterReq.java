package com.sjtu.subscribeclient.model.request.register;

public class UnregisterReq {
    private String op;
    private String userId;

    public UnregisterReq(String userId) {
        this.op = "UNREGISTER";
        this.userId = userId;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
