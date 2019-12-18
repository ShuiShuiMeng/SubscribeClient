package com.sjtu.subscribeclient.model.request.object;

import com.sjtu.subscribeclient.model.request.base.BaseReq;

import java.util.HashMap;
import java.util.List;

public class ObjCreateReq extends BaseReq {
    private boolean response;
    private String name;
    private String intro;
    private String template;
    private List<String> events;
    private HashMap<String, String> attrs;

    public ObjCreateReq(String userId, boolean response, String id, String name, String intro, String template, List<String> events, HashMap<String, String> attrs) {
        this.op = "CREATE_OBJECT";
        this.userId = userId;
        this.response = response;
        this.id = id;
        this.name = name;
        this.intro = intro;
        this.template = template;
        this.events = events;
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

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public HashMap<String, String> getAttrs() {
        return attrs;
    }

    public void setAttrs(HashMap<String, String> attrs) {
        this.attrs = attrs;
    }
}
