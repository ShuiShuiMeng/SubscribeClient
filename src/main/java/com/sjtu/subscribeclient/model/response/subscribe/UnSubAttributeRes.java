package com.sjtu.subscribeclient.model.response.subscribe;

import com.sjtu.subscribeclient.model.response.base.BaseRes;

import java.util.List;

public class UnSubAttributeRes extends BaseRes {

    private String id;
    private List<String> names;

    public UnSubAttributeRes(String status, String message, String id, List<String> names) {
        this.op = "UNSUB_ATTR";
        this.status = status;
        this.message = message;
        this.id = id;
        this.names = names;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
