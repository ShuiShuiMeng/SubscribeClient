package com.sjtu.subscribeclient.model.request.subscribe;

import com.sjtu.subscribeclient.common.Constants;
import com.sjtu.subscribeclient.model.request.base.BaseReq;

import java.util.List;

public class SubObjectReq extends BaseReq {
    private boolean latest;

    public SubObjectReq(String userId, String id, Boolean latest) {
        this.op = "SUB_OBJECT";
        this.userId = userId;
        this.id = id;
        this.latest = latest;
    }

    public boolean getLatest() {
        return latest;
    }

    public void setLatest(boolean latest) {
        this.latest = latest;
    }
}
