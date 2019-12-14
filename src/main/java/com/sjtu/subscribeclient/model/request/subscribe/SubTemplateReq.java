package com.sjtu.subscribeclient.model.request.subscribe;

import com.sjtu.subscribeclient.model.request.base.BaseReq;

import java.util.List;

public class SubTemplateReq extends BaseReq {

    private List<String> name;
    private List<String> events;

    public SubTemplateReq(String userId, String id, List<String> name, List<String> events) {
        this.op = "SUB";
        this.userId = userId;
        this.id = id;
        this.name = name;
        this.events = events;
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }
}
