package com.sjtu.subscribeclient.model.response.subscribe;

import com.sjtu.subscribeclient.model.response.base.BaseRes;

import java.util.List;

public class SubTemplateRes extends BaseRes {

    private String template;
    private List<String> events;

    public SubTemplateRes(String status, String message, String template, List<String> events) {
        this.op = "SUB_TEMPLATE";
        this.status = status;
        this.message = message;
        this.template = template;
        this.events = events;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }
}
