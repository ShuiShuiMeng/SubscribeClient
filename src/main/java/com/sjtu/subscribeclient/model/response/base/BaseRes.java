package com.sjtu.subscribeclient.model.response.base;

public class BaseRes {
    protected String op;
    protected String status;

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
