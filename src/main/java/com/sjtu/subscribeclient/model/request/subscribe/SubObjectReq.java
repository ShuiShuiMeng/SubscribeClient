package com.sjtu.subscribeclient.model.request.subscribe;

import com.sjtu.subscribeclient.common.Constants;
import com.sjtu.subscribeclient.model.request.base.BaseReq;

import java.util.List;

public class SubObjectReq extends BaseReq {
    private String type;
    private List<String> name;
    private boolean latest;

    public SubObjectReq(String userId, String id, List<String> name, Boolean latest) {
        this.op = "SUB";
        this.userId = userId;
        this.id = id;
        this.type = Constants.ENTITY_TYPE;
        this.name = name;
        this.latest = latest;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
