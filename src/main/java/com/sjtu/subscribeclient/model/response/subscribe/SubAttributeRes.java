package com.sjtu.subscribeclient.model.response.subscribe;

import com.sjtu.subscribeclient.model.object.AttributeRes;
import com.sjtu.subscribeclient.model.response.base.BaseRes;

import java.util.List;
import java.util.Map;

public class SubAttributeRes extends BaseRes{

    private String id;
    private List<String> names;
    private Map<String, AttributeRes> attrs;

    public SubAttributeRes(String status, String message, String id, List<String> names, Map<String, AttributeRes> attrs) {
        this.op = "SUB_ATTR";
        this.status = status;
        this.message = message;
        this.id = id;
        this.names = names;
        this.attrs = attrs;
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

        public Map<String, AttributeRes> getAttrs() {
        return attrs;
    }

        public void setAttrs(Map<String, AttributeRes> attrs) {
        this.attrs = attrs;
    }
}
