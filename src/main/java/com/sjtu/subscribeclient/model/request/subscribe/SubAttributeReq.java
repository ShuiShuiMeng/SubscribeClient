package com.sjtu.subscribeclient.model.request.subscribe;

import com.sjtu.subscribeclient.model.request.base.BaseReq;
import com.sjtu.subscribeclient.model.response.base.BaseRes;

import java.util.List;
import java.util.Map;

public class SubAttributeReq extends BaseReq {

    private List<String> names;
    private boolean latest;

    public SubAttributeReq(String userId, String id, List<String> names, Boolean latest) {
        this.op = "SUB_ATTR";
        this.userId = userId;
        this.id = id;
        this.names = names;
        this.latest = latest;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public boolean getLatest() {
        return latest;
    }

    public void setLatest(boolean latest) {
        this.latest = latest;
    }
}
