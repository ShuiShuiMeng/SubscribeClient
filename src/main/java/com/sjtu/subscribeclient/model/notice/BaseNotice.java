package com.sjtu.subscribeclient.model.notice;

public class BaseNotice {
    protected String op;
    protected String message;

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}