package com.sjtu.subscribeclient.model.response.subscribe;

import com.sjtu.subscribeclient.model.response.base.BaseRes;

public class UnSubTemplateRes extends BaseRes {
    private String template;

    public UnSubTemplateRes(String status, String message, String template) {
        this.op = "SUB_TEMPLATE";
        this.op = status;
        this.message = message;
        this.template = template;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
}
