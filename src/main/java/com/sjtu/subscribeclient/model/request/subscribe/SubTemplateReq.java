package com.sjtu.subscribeclient.model.request.subscribe;

import com.sjtu.subscribeclient.model.request.base.BaseReq;

import java.util.List;

public class SubTemplateReq extends BaseReq {

    private String template;
    private List<String> events;

    public SubTemplateReq(String userId, String template, List<String> events) {
        this.op = "SUB_TEMPLATE";
        this.userId = userId;
        this.template = template;
        this.events = events;
    }

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
}
