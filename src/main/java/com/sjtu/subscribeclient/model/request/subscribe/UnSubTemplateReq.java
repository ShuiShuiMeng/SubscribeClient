package com.sjtu.subscribeclient.model.request.subscribe;

import com.sjtu.subscribeclient.model.request.base.BaseReq;

public class UnSubTemplateReq extends BaseReq {

    private String template;

    public UnSubTemplateReq(String userId, String template) {
        this.op = "UNSUB_TEMPLATE";
        this.userId = userId;
        this.template = template;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
}
