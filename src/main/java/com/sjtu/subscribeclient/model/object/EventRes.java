package com.sjtu.subscribeclient.model.object;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class EventRes {
    private String id;          // id
    private String name;        // 英文
    private String intro;       // 中文
    private String template;    // 模板id

    private List<String> objects;

    private HashMap<String, AttributeRes> attrs;

    private Date startTime;
    private Date endTime;

    private boolean status;      // t-进行中 f-已结束
    private String stage;       // 自定义的事件子状态

    private Date updateTime;
    private Date createTime;

    public EventRes(String id, String name, String intro, String template, List<String> objects, HashMap<String, AttributeRes> attrs, Date startTime, Date endTime, boolean status, String stage, Date createTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.intro = intro;
        this.template = template;
        this.objects = objects;
        this.attrs = attrs;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
        this.stage = stage;
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

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public List<String> getObjects() {
        return objects;
    }

    public void setObjects(List<String> objects) {
        this.objects = objects;
    }

    public HashMap<String, AttributeRes> getAttrs() {
        return attrs;
    }

    public void setAttrs(HashMap<String, AttributeRes> attrs) {
        this.attrs = attrs;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
