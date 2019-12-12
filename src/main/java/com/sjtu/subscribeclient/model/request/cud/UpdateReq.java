package com.sjtu.subscribeclient.model.request.cud;

import com.sjtu.subscribeclient.model.request.base.BaseReq;

public class UpdateReq extends BaseReq {
    private boolean response;
    private String name;
    private String value;

    public UpdateReq(String userId, String id, String name, String value) {
        new UpdateReq(userId, id, true, name, value);
    }

    public UpdateReq(String userId, String id, boolean response, String name, String value) {
        this.op = "UPDATE";
        this.userId = userId;
        this.id = id;
        this.response = response;
        this.name = name;
        this.value = value;
    }

    public boolean getResponse() {
        return response;
    }

    public void setResponse(boolean response) {
        this.response = response;
    }

    public boolean isResponse() {
        return response;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
