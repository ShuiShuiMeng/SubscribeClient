package com.sjtu.subscribeclient.model.request.subscribe;

import com.sjtu.subscribeclient.model.request.base.BaseReq;

import java.util.List;

public class UnSubAttributeReq extends BaseReq {

    private List<String> names;

    public UnSubAttributeReq(String userId, String id, List<String> names) {
        this.op = "UNSUB_ATTR";
        this.userId = userId;
        this.id = id;
        this.names = names;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
