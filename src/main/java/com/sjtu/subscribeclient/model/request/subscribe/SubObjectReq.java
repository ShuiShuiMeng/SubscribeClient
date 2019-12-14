package com.sjtu.subscribeclient.model.request.subscribe;

import com.sjtu.subscribeclient.common.Constants;
import com.sjtu.subscribeclient.model.request.base.BaseReq;

import java.util.List;

public class SubObjectReq extends BaseReq {
    private List<String> name;
    private boolean latest;

    public SubObjectReq(String userId, String id, List<String> name, Boolean latest) {
        this.op = "SUB";
        this.userId = userId;
        this.id = id;
        this.name = name;
        this.latest = latest;
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public boolean getLatest() {
        return latest;
    }

    public void setLatest(boolean latest) {
        this.latest = latest;
    }
}
