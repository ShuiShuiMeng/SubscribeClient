package com.sjtu.subscribeclient.model.request.event;

import com.sjtu.subscribeclient.model.request.base.BaseReq;

import java.util.HashMap;

public class EventCreateReq extends BaseReq {
    private boolean response;
    private String name;
    private String intro;
    private String template;
    private HashMap<String, String> attrs;

    public EventCreateReq(String userId, boolean response, String id, String name, String intro, String template, HashMap<String, String> attrs) {
        this.op = "CREATE_EVENT";
        this.userId = userId;
        this.id = id;
        this.response = response;
        this.name = name;
        this.intro = intro;
        this.template = template;
        this.attrs = attrs;
    }

    public boolean getResponse() {
        return response;
    }

    public void setResponse(boolean response) {
        this.response = response;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public HashMap<String, String> getAttrs() {
        return attrs;
    }

    public void setAttrs(HashMap<String, String> attrs) {
        this.attrs = attrs;
    }
}
