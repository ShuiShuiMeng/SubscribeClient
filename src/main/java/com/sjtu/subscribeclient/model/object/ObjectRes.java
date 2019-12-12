package com.sjtu.subscribeclient.model.object;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ObjectRes {
    private String id;              // 对象id
    private String name;            // 英文
    private String intro;           // 描述
    private String type;            // 类型
    private String template;        // 模板id

    private HashMap<String, Date> events; // 关联的events

    private HashMap<String, AttributeRes> attrs;  // 最新属性集合

    private Date createTime;
    private Date updateTime;

    public ObjectRes(String id, String name, String intro, String type, String template, HashMap<String, Date> events, HashMap<String, AttributeRes> attrs, Date createTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.intro = intro;
        this.type = type;
        this.template = template;
        this.attrs = attrs;
        this.events = events;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public HashMap<String, Date> getEvents() {
        return events;
    }

    public void setEvents(HashMap<String, Date> events) {
        this.events = events;
    }

    public HashMap<String, AttributeRes> getAttrs() {
        return attrs;
    }

    public void setAttrs(HashMap<String, AttributeRes> attr) {
        this.attrs = attr;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder eventsStr = new StringBuilder("{");
        StringBuilder attrsStr = new StringBuilder("{");

        for (Map.Entry event : events.entrySet()) {
            eventsStr.append("\"").append(event.getKey()).append("\":").append(event.getValue()).append(",");
        }
        if (eventsStr.length() > 1) eventsStr.setCharAt(eventsStr.length()-1, '}');
        else eventsStr.append('}');

        for (Map.Entry attr : attrs.entrySet()) {
            AttributeRes mongoAttr = (AttributeRes) attr.getValue();
            attrsStr.append("\"").append(attr.getKey()).append("\":").append("{\"value\":").append(mongoAttr.getValue()).append(",\"updateTime\":")
                    .append(mongoAttr.getUpdateTime().toString()).append("},");
        }
        if (attrsStr.length() > 1) attrsStr.setCharAt(attrsStr.length()-1, '}');
        else attrsStr.append('}');

        return ("{\"id\":" + id +
                ",\"name\":" + name +
                ",\"intro\":" + intro +
                ",\"type\":" + type +
                ",\"template\":" + template +
                ",\"events\":" + eventsStr +
                ",\"attrs\":" + attrsStr +
                ",\"createTime\":" + getCreateTime().toString() +
                ",\"updateTime\":" + getUpdateTime().toString() +
                "}"
        );
    }
}
