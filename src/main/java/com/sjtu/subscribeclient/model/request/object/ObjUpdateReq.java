package com.sjtu.subscribeclient.model.request.object;

import com.sjtu.subscribeclient.model.request.base.BaseReq;

public class ObjUpdateReq extends BaseReq {
    private boolean response;
    private String name;
    private String value;

    public ObjUpdateReq(String userId, boolean response, String id, String name, String value) {
        this.op = "UPDATE_OBJECT";
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
