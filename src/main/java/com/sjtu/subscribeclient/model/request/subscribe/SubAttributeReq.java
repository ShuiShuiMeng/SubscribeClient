package com.sjtu.subscribeclient.model.request.subscribe;

import com.sjtu.subscribeclient.model.response.base.BaseRes;

import java.util.List;
import java.util.Map;

public class SubAttributeReq extends BaseRes {

    private String id;
    private List<String> names;
    private boolean latest;

    public SubAttributeReq(String status, String message, String id, List<String> names, boolean latest) {
        this.op = "SUB_ATTR";
        this.status = status;
        this.message = message;
        this.id = id;
        this.names = names;
        this.latest = latest;
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

    public boolean getLatest() {
        return latest;
    }

    public void setLatest(boolean latest) {
        this.latest = latest;
    }
}
